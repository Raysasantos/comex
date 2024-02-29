package integracao;

import br.com.alura.comex.EnderecoRecord;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Viacepservice {
    public EnderecoRecord buscarCEP(String cep) {
        Scanner busca = new Scanner(System.in);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/"  + cep + "/json/"))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            return new Gson().fromJson(json, EnderecoRecord.class);
        } catch (Exception e) {
            System.err.println("digitou errado cep");
            throw new RuntimeException(e);

        }
    }
}

