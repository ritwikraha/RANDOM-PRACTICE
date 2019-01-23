import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Trigon {

    static int lowestTriangle(int base, int area){
        // Complete this function
       int h;
       h=(2*area)/base;
       if(((2*area)%base)!=0)
       h++;
    return h;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int area = in.nextInt();
        int height =lowestTriangle(base, area);
        System.out.println(height);
    }
}

