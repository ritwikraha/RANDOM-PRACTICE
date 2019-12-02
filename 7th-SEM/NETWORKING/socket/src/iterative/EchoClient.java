package iterative;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) throws Exception {
		//Connect to server
		Socket clientSocket = new Socket("localhost",2000);
		System.out.println("Got connected...");
		
		//Exchange hello message
		BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());		
        String msg1=br.readLine();
        System.out.println("server says: " + msg1);		
		pw.println("Hello Server");
		pw.flush();
		
		//Exchange echo message
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the message: ");
		String msg=br1.readLine();
		pw.println(msg);
        pw.flush();
        msg1 = br.readLine();
        System.out.println("From Server: "+msg1);
	}

}
