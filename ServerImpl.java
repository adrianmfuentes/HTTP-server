import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerImpl implements Server {
    public ServerImpl() {
        System.out.println("Server is running...");
    }

    @Override
    public void processRequest(Socket clientSocket) {
        try (InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream())) {
            BufferedReader reader = new BufferedReader(isr);

            String line = reader.readLine();            
            while (!line.isEmpty()) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
           System.out.println("Error reading from client socket");
        }
    }

    @Override
    public void sendResponse(Socket clientSocket, ServerSocket serverSocket) {
        try (Socket socket = serverSocket.accept()) {
            Date today = new Date();
            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
            socket.getOutputStream()
                  .write(httpResponse.getBytes("UTF-8"));

        } catch (IOException e) {
            System.out.println("Error writing to client socket");

        } finally {
            try { clientSocket.close(); } catch (IOException e) {
                System.out.println("Error closing client socket");
            }
        }
    }
}
