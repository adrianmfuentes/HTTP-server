import java.net.ServerSocket;
import java.net.Socket;

public interface Server {
    void processRequest(Socket clientSocket);
    void sendResponse(Socket clientSocket, ServerSocket serverSocket);
}
