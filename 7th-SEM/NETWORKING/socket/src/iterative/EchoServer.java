package iterative;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String args[]) throws Exception {
		//Waiting for connection
		ServerSocket welcomeSocket = new ServerSocket(2000);
		System.out.println("Server is listening...");
		Socket connectionSocket = welcomeSocket.accept();	
		System.out.println("Connected... :)");
		
		//Exchange hello message
		BufferedReader br = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
		PrintWriter pw = new   	PrintWriter(connectionSocket.getOutputStream());
		pw.println("Hello Client...");
		pw.flush();		
		String line = br.readLine();
		System.out.println("client says: " + line);
		
		//Exchange echo message
		String msg1=br.readLine();
		System.out.println("client says: " + msg1);
		pw.println(msg1+" Server");
		pw.flush();	

	}
}
