package structuralpatterns.facade;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class POST {
    public HttpResponse<String> sendRequest(String uri, String body) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
