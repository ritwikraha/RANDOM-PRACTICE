import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {
		

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int nItr = 0; nItr < n; nItr++) {
            String[] pxPyQxQy = scanner.nextLine().split(" ");
            int rx=0,ry=0;

            int px = Integer.parseInt(pxPyQxQy[0].trim());

            int py = Integer.parseInt(pxPyQxQy[1].trim());

            int qx = Integer.parseInt(pxPyQxQy[2].trim());

            int qy = Integer.parseInt(pxPyQxQy[3].trim());

            //int[] result = findPoint(px, py, qx, qy);
            /*
            for (int resultItr = 0; resultItr < result.length; resultItr++) {
                bufferedWriter.write(String.valueOf(result[resultItr]));

                if (resultItr != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }*/
             rx=(2*qx)-px;
         	 ry=(2*qy)-py;
         	 //bufferedWriter.write(String.valueOf(rx)+" "+String.valueOf(ry));
         	 System.out.println(String.valueOf(rx)+" "+String.valueOf(ry));

           //bufferedWriter.newLine();
        }

       // bufferedWriter.close();
    }
}
