import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda buscaMoneda(String tipoMoneda) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/516391589b9459baf5fc3a50/latest/" + tipoMoneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Moneda miRespuesta = gson.fromJson(response.body(), Moneda.class);

            return miRespuesta;

        } catch (Exception e) {
            throw new RuntimeException("No encontré esa Esa moneda."); //Creamos nuestra excepcion
        }
    }
}
