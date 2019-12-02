package concurrent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadHandler extends Thread {
	  Socket newsock;
	  ThreadHandler(Socket s)
	  {
	    newsock=s;
	  }
	  public void run()
	  {
	    try{
	        BufferedReader br=new BufferedReader(new InputStreamReader(newsock.getInputStream()));
	        PrintWriter pw=new PrintWriter(newsock.getOutputStream());
	        pw.println("Hello client:: enter your name");
	        pw.flush();
	        String cName = br.readLine();
	        String msg1=br.readLine();
	/*        if(msg1.equals("quit"))
	        {
	        	System.out.println(cName + " exit ");	
	        }
	  */      while(!msg1.equalsIgnoreCase("quit")){
	        	System.out.println(cName + " says: " + msg1);
	        	msg1=br.readLine();
	        }
	    } catch(IOException e){
	    	System.out.println("IO error"+e);
	    }
	}

}
