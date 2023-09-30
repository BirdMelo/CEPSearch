package Operations;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SearchHttp {
    public Address http(String search){

        URI address = URI.create(String.format("https://viacep.com.br/ws/%s/json/",search));

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();

        HttpResponse<String> response = null;
        try {
             response = HttpClient
                     .newHttpClient()
                     .send(request,HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Endereço errado.");
        }
        return new Gson().fromJson(response.body(), Address.class);
    }
}
