package iterative;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) throws Exception {
		//Connect
		Socket clientSocket = new Socket("localhost",2001);
		System.out.println("Got connected with server...");
		
		//Exchange Hello Message
		BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());	
		String msg=br.readLine();
		System.out.println("server: " + msg);			
		pw.println("Hello Server");
		pw.flush();
		
		//Exchange chat message
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the message: ");
		msg=br1.readLine();
		pw.println(msg);
		pw.flush();
		msg = br.readLine();
		System.out.println("server: "+msg);
		}

}
