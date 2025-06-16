package structuralpatterns.facade;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

/**
 *        RequestHandler requestHandler = new RequestHandler();
 *
 *         HttpResponse<String> response = requestHandler.get("https://www.google.com");
 *
 *         if(response != null){
 *             System.out.println(response.statusCode());
 *             System.out.println(response.body());
 *         }
*/

public class RequestHandler {
    GET get = new GET();
    POST post = new POST();

    public HttpResponse<String> get(String url) {
        return get.sendRequest(url);
    }

    public HttpResponse<String> post(String url, String body) throws IOException, InterruptedException {
        return post.sendRequest(url, body);
    }
}
