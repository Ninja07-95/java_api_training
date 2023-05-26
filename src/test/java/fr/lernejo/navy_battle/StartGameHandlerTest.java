package fr.lernejo.navy_battle;

import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartGameHandlerTest {
    private final HttpClient client = HttpClient.newHttpClient();

    @Test
    public void handleStartGameTest() throws Exception {
        int port = 9876;
        String[] args = new String[]{String.valueOf(port)};
        Launcher.main(args);

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:" + port + "/api/game/start")).POST(HttpRequest.BodyPublishers.noBody()).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        assertEquals(202, response.statusCode());
    }
}

