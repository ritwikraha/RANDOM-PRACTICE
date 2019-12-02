package concurrent;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		  try  
		  {
		    ServerSocket sock=new ServerSocket(2000);
		    System.out.println("Server is listening...");
		    while(true)
		    {
		    	Socket newsock=sock.accept();
		    	int i=1;
//		    	System.out.println("Connected! Creating thread to handle this client"+i++);
		    	
		    	ThreadHandler t=new ThreadHandler(newsock);
		    	t.start();
//		      	System.out.println("Running thread for client"+(i++));
		     }
		   }
		   catch(Exception e)
		   {
			   System.out.println("IO error"+e);
		   }


	}

}
