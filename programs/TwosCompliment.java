import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TwosCompliment {

    /*
     * Complete the twosCompliment function below.
     */
    static long twosCompliment(long a, long b) {
        long count = 0;
        
      System.out.println(Long.toBinaryString(-2));
        
       // for each number from a to b
        for(int i = (int)a; i <=(int)b; i++)
        {
          // System.out.println(Long.toBinaryString(-2));
            // calculate 32-bit 2's complement of the number           
           // invert the number by performing bitwise xor with FFFF (all 1's)
           //      i = i ^ 0xffff;
           // add 1 to the number 
           //     i++;
           // calculate number of 1's
           // convert to binary string
           String binaryStr = Integer.toBinaryString(i);
            
          //  System.out.println(binaryStr);
            for(int j = 0; j < binaryStr.length(); j++)
            {
                if(binaryStr.charAt(j) == '1')
                    count++;
            }
            
        }
      
            return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ab = scanner.nextLine().split(" ");

            long a = Long.parseLong(ab[0].trim());

            long b = Long.parseLong(ab[1].trim());

            long result = twosCompliment(a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}