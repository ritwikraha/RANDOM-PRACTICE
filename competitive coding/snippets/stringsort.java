import java.io.*;
import java.lang.*;
import java.util.*;

public class stringsort{
	public static void main(String args[]){
	String sentence = new Scanner(System.in).nextLine();
    String[] arr= new String[sentence.length() + 1];
    Arrays.fill(arr, "");
    for(String word : sentence.split("[^a-zA-Z'\\-]+")) {arr[word.length()] += word + " ";}
    for(String s : arr) {System.out.print(s);}
    System.out.println();
  }

}