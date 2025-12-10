/* MENU:
1 - DOLAR => PESO
2 - PESO => DOLAR
3 - DOLAR => REAL BRASILEÑP
4 - REAL => DOLAR
5 - DOLAR => PESO COLOMBIANO
6 - PESO COLOMABIANO => DOLAR
7 - SALIR
ELIJA:
*/


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

                String codigoBase = "";
                String codigoTarget = "";

                // Configuramos los códigos según la opción
                switch (opcion) {
                    case 1:
                        codigoBase = "USD";
                        codigoTarget = "ARS";
                        break;
                    case 2:
                        codigoBase = "ARS";
                        codigoTarget = "USD";
                        break;
                    case 3:
                        codigoBase = "USD";
                        codigoTarget = "BRL";
                        break;
                    case 4:
                        codigoBase = "BRL";
                        codigoTarget = "USD";
                        break;
                    case 5:
                        codigoBase = "USD";
                        codigoTarget = "COP";
                        break;
                    case 6:
                        codigoBase = "COP";
                        codigoTarget = "USD";
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        continue; // Vuelve al inicio del while
                }

                System.out.println("Ingrese el valor que desea convertir: ");
                double cantidad = lectura.nextDouble();

                Moneda moneda = consulta.buscaMoneda(codigoBase);

                Double tasa = moneda.conversion_rates().get(codigoTarget);

                double resultado = cantidad * tasa;

                System.out.println("El valor " + cantidad + " [" + codigoBase + "] " +
                        "corresponde al valor final de =>>> " + resultado + " [" + codigoTarget + "]");

            }catch (Exception e) {
                System.out.println("Ocurrió un error (ingrese solo números)");
                lectura.nextLine();
            }
        }
    }
}
