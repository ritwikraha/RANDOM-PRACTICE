package iterative;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) throws Exception {
		//Wait for connection
		ServerSocket welcomeSocket = new ServerSocket(2001);
		System.out.println("Server is listening...");
		Socket connectionSocket = welcomeSocket.accept();	
		System.out.println("Connected with Client... :)");
		
		//Exchange hello message
		BufferedReader br = new BufferedReader(new 	InputStreamReader(connectionSocket.getInputStream()));
	    PrintWriter pw = new PrintWriter(connectionSocket.getOutputStream());
		pw.println("Hello Client...");
		pw.flush();	
		String line = br.readLine();
		System.out.println("client: " + line);
	
		//Exchange chat message
		String msg=br.readLine();
		System.out.println("client: " + msg);
	    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("Enter a message: ");
		msg=br1.readLine();
		pw.println(msg);
		pw.flush();		
	}

}
