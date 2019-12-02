package chat;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatGUI extends JFrame implements ActionListener{
	JTextArea history = new JTextArea();
	JTextField msg = new JTextField(10);
	JTextField ip = new JTextField(6);
	JTextField port = new JTextField(4);
	String user;
	public ChatGUI() {
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		add(history);
		JPanel bottomPanel = new JPanel();
		bottomPanel.add(new JLabel("Msg:"));
		bottomPanel.add(msg);
		bottomPanel.add(new JLabel("IP:"));
		bottomPanel.add(ip);
		bottomPanel.add(new JLabel("Port:"));
		bottomPanel.add(port);
		JButton sendBtn = new JButton("Send");
		sendBtn.addActionListener(this);
		bottomPanel.add(sendBtn);
		add(bottomPanel,BorderLayout.SOUTH);
	}
	
	public static void main(String args[]) throws Exception {
		ChatGUI gui = new ChatGUI();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:");
		gui.user = sc.nextLine();
		System.out.print("Enter the listning port:");		
		int port=sc.nextInt();		
		gui.setTitle(gui.user+":"+port);
		gui.setVisible(true);
		ServerSocket welcomeSock=new ServerSocket(port);
		while(true)
	    {
	    	Socket connectionSock=welcomeSock.accept();
	    	BufferedReader br=new BufferedReader(new InputStreamReader(connectionSock.getInputStream()));
	    	String msg = br.readLine();
	    	gui.history.setText(gui.history.getText()+"\n"+msg);
	    	connectionSock.close();
	     }
	}

	public void actionPerformed(ActionEvent arg0) {
		try {
			Socket socket = new Socket(ip.getText(),Integer.parseInt(port.getText()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());		
			pw.println(user+":"+msg.getText());
			pw.flush();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
