/*package fr.lernejo.navy_battle;

import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class Launcher {
    public static void main(String[] args) {
        if (args.length != 1 && args.length != 2) {
            System.out.println("Usage: java fr.lernejo.navy_battle.Launcher [port] [optional opponent URL]");
            System.exit(1);
        }

        int port = Integer.parseInt(args[0]);

        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
            server.createContext("/ping", new PingHandler());
            server.createContext("/api/game/start", new StartGameHandler());
            server.createContext("/api/game/fire", new FireHandler());

            server.setExecutor(null); 
            server.start();

            if (args.length == 2) {
                String opponentUrl = args[1];
                StartGameClient client = new StartGameClient();
                client.startGame(opponentUrl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/
package fr.lernejo.navy_battle;

import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class Launcher {
    public static void main(String[] args) {
        if (args.length != 1 && args.length != 2) {
            System.out.println("Usage: java fr.lernejo.navy_battle.Launcher [port] [optional opponent URL]");
            System.exit(1);
        }

        int port = Integer.parseInt(args[0]);

        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
            server.createContext("/ping", new PingHandler());
            server.createContext("/api/game/start", new StartGameHandler());
            server.createContext("/api/game/fire", new FireHandler());

            server.setExecutor(null); 
            server.start();

            if (args.length == 2) {
                String opponentUrl = args[1];
                StartGameClient client = new StartGameClient();
<<<<<<< HEAD
                client.startGame(opponentUrl);
=======
                String response = client.startGame(opponentUrl + "/api/game/start");
                System.out.println(response);
>>>>>>> f2c3deaf31d7e4d5c3ea27ce07fa077fc04fbfba
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
