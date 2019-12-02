package error;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CRC2 {


	public static void main(String[] args) throws Exception{
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  System.out.print("Enter Generator:");
		  String divisor = br.readLine();
		  System.out.print("Enter Data:");
		  String dataword = br.readLine();
		  
		  String augmentedData = dataword;
		  while(augmentedData.length() < (dataword.length() + divisor.length() - 1))
			  augmentedData = augmentedData + "0";
		  
		  String codeword = dataword + mod2div(augmentedData,divisor);
		  
		  System.out.println("The transmitted Code Word is: " + codeword);
		  
		  System.out.print("Please enter the received Code Word: ");
		  String rec = br.readLine();
		  if(Integer.parseInt(mod2div(rec,divisor)) == 0)
			  System.out.println("The received code word contains no errors.");
		  else
			  System.out.println("The received code word contains errors.");

	}
	
	static String mod2div(String augmentedDataword,String divisor)
	{
		  int pointer = divisor.length();
		  String remainder=augmentedDataword.substring(0, divisor.length());
		  for(int i=0;i<divisor.length();i++){
			  if(remainder.charAt(0)=='1'){
				  remainder = xor(remainder,divisor);
			  }
			  if(i!=divisor.length()-1){
				  remainder = remainder.substring(1, remainder.length());
				  remainder = remainder + String.valueOf(augmentedDataword.charAt(pointer++));
			  }
			  System.out.println("Remainder="+remainder);
			  
		  }
		  return remainder.substring(1,remainder.length());
	 }
	
	 static String xor(String num1, String num2){
		 String result="";
		 for(int i=0; i<num1.length();i++){
			 if(num1.charAt(i)==num2.charAt(i)){
				 result+="0";
			 }else{
				 result+="1";
			 }
		 }
		 return result;
	 }

}
