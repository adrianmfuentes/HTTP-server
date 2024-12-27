import java.net.ServerSocket;
import java.net.Socket;

/**
 * The code below creates a server socket on port 8080 and listens for incoming connections. 
 * To run the server, compile the code and run the class file. 
 * 
 * El codigo a continuacion crea un socket de servidor en el puerto 8080 y escucha las conexiones entrantes.
 * Para ejecutar el servidor, compile el codigo y ejecute el archivo de clase.
 * 
 * @author Adrián Martínez Fuentes
*/
public class Main {

  private static Server server = new ServerImpl();

  public static void main(String[] args) throws Exception {
    final ServerSocket serverSocket = new ServerSocket(8080);
    System.out.println("Listening for connection on port 8080 ....");

    while (true) {
      final Socket clientSocket = serverSocket.accept();
      server.processRequest(clientSocket);
      server.sendResponse(clientSocket, serverSocket);
    }
  }

}
