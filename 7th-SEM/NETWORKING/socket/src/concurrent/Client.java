package concurrent;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost",2000);
		System.out.println("Got connected...");
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String msg1=br.readLine();
        System.out.println(msg1);
		PrintWriter pw = new PrintWriter(socket.getOutputStream());		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String msg=br1.readLine();
		pw.println(msg);
	    pw.flush();
		while(true)
		{   
			System.out.print("Enter a message.(\"quit\" to terminate):");
			msg=br1.readLine();
			pw.println(msg);
		    pw.flush();
			if(msg.equals("quit"))
		         break;
		}
	}

}
