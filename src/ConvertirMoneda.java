import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertirMoneda {

    public static void ejecute() {
        ConsultaMoneda consulta = new ConsultaMoneda();
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a conversor de monedas");

        while(opcion != 7) {
            System.out.println("1) Dolar => Peso Argentino");
            System.out.println("2) Peso Argentino => Dolar");
            System.out.println("3) Dolar => Real Brasileño");
            System.out.println("4) Real Brasileño => Dolar");
            System.out.println("5) Dolar => Peso Colombiano");
            System.out.println("6) Peso Colombiano => Dolar");
            System.out.println("7) Salir");
            System.out.println("Elija la opcion: ");

            try {
                opcion = lectura.nextInt();
                lectura.nextLine();

                if (opcion == 7) {
                    System.out.println("Finalizo el programa... Gracias");
                    break;
                }

                String monedaBase = "";
                String monedaDestino = "";

                // Configuramos los códigos según la opción
                switch (opcion) {
                    case 1:
                        monedaBase = "USD";
                        monedaDestino = "ARS";
                        break;
                    case 2:
                        monedaBase = "ARS";
                        monedaDestino = "USD";
                        break;
                    case 3:
                        monedaBase = "USD";
                        monedaDestino = "BRL";
                        break;
                    case 4:
                        monedaBase = "BRL";
                        monedaDestino = "USD";
                        break;
                    case 5:
                        monedaBase = "USD";
                        monedaDestino = "COP";
                        break;
                    case 6:
                        monedaBase = "COP";
                        monedaDestino = "USD";
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        continue;
                }

                System.out.println("Ingrese el valor que desea convertir: ");
                double cantidad = lectura.nextDouble();

                Moneda moneda = consulta.buscaMoneda(monedaBase);

                Double tasa = moneda.conversion_rates().get(monedaDestino);

                double resultado = cantidad * tasa;

                System.out.println("El valor " + cantidad + " [" + monedaBase + "] " +
                        "corresponde al valor final de =>>> " + resultado + " [" + monedaDestino + "]");

            }catch (InputMismatchException e) {
                System.out.println("Ocurrió un error (ingrese solo números)");
                lectura.nextLine();
            }
        }
    }
}
