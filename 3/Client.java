import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
/**
 *
 * @author efron
 */
public class Client {
	public static void main(String[] args){
		//If I put localhost or 127.0.0.1 as the servername, it works
		String serverName = "127.0.0.1";		//put my own ip address in servername, got it from http://www.whatismyip.com/
		int portNumber = Integer.parseInt("49999");
		try {
			System.out.println("Connecting to server " + serverName + " on port " + portNumber);
			Socket client = new Socket(InetAddress.getByName(serverName), portNumber);
			System.out.println("Connected to server!");
			DataInputStream in = new DataInputStream(client.getInputStream());
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			out.writeUTF("Hi Server! I'm " + client.getLocalSocketAddress());
			System.out.println("Message from Server: " + in.readUTF());
			client.close();
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}
}