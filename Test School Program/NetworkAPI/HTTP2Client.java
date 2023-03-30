package NetworkAPI;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTP2Client {
    private String apiKey;
    private String searchKeyNearby;

    public void testClient() {
        try {
            HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
            HttpRequest req = HttpRequest.newBuilder().uri(URI.create(searchKeyNearby)).GET().build();

            HttpResponse<String> resp = httpClient.send(req, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response: " + resp.statusCode() + " : " + resp.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
