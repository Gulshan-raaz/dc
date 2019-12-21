import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author efron
 */
public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(Integer.parseInt("49999"));
			System.out.println(serverSocket.getLocalPort());
			while (true) {
				System.out.println("Waiting for Client...(port = " + 49999 + ")");
				Socket acceptSocket = serverSocket.accept();
				
				System.out.println("Connected to: " + acceptSocket.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(acceptSocket.getInputStream());
				DataOutputStream out = new DataOutputStream(acceptSocket.getOutputStream());
				System.out.println(in.readUTF());
				out.writeUTF("You have been connected to the server" + acceptSocket.getLocalSocketAddress());
				acceptSocket.close();
			}
		} catch (Exception e) {
		}
	}
}