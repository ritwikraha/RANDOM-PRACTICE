import java.io.*;
import java.lang.*;
import java.util.*;

	class StringRotate{
		public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 String s=sc.nextLine();
		 int q=sc.nextInt();
		 int i=0;
		 String s1="";
		 boolean status=false;
			 if((q<=10)&&(s.length()<=30)){
			 char d[]=new char[q];
			 int r[]=new int[q];
			 String k[]=new String[q];
				 for(i=0;i<q;i++){
				 	d[i]=sc.next().charAt(0);
				 	r[i]=sc.nextInt();
					 switch(d[i]){
					 case 'L':
					 k[i]=s.substring(r[i]-1)+s.substring(0,r[i]-1);
					 break;
					 case 'R':
					 k[i]=s.substring(s.length()-r[i],s.length())+s.substring(0,s.length()-r[i]);
					 break;
					 /*default:
					 System.out.println("wrong message");
					 break;*/
					 }
				 }
				 for(i=0;i<q;i++){
				 	s1=k[i].substring(0,1)+s1;
				 }
				 char[] ArrayS1 = s.toLowerCase().toCharArray();  
            	char[] ArrayS2 = s1.toLowerCase().toCharArray();  
            	Arrays.sort(ArrayS1);  
            	Arrays.sort(ArrayS2);  
            	status = Arrays.equals(ArrayS1, ArrayS2);
            	if(status==true) {  
            		System.out.println("YES");  
        		} else {  
            		System.out.println("NO");  
       			 }  
			 }
			 else{
			 	//System.out.println("input out of bounds");
			 	System.exit(0);
			 }
		 }
	}