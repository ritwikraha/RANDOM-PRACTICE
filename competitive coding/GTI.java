import java.io.*;
import java.util.*;

public class GTI{
	public static String checkfunc(String s,String d){
	int sub=0,w=0;
	while (sub<s.length()){
		if (d.charAt(w)==s.charAt(sub)){
		w++;
		}
	sub++;
	}
	if(w==d.length()){
	return d;
	}
	else{
	return "";
	}
	}
	public static void main(String args[])throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the big wala word");
		String s=sc.nextLine();
		int max=0,i=0;
		String temp="",k="";
		System.out.println("enter length of dictionary");
		int n=sc.nextInt();
		String D[]=new String[n];
		for(i=0;i<D.length;i++){
			System.out.println("enter word");
			D[i]=sc.next();
			k=checkfunc(s,D[i]);
			if(max<k.length()){
				max=k.length();
				temp=k;
			}
		}
		/*for(i=0;i<D.length;i++){
			k=checkfunc(s,D[i]);
			if(max<k.length()){
				max=k.length();
				temp=k;
			}
		}*/
		
		System.out.println(temp);
	}
}