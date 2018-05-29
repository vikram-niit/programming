import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DigitSum{

    // Complete the digitSum function below.
    static int digitSum(String n, int k) {        
        
        if(n.length() == 1)
            return Integer.parseInt(n);
        
        StringBuffer strBuffer = new StringBuffer();
        
        String[] x = n.split("");
        
        Long sum = (long)0;
        for(int i = 1; i < x.length; i++)
        {
            System.out.println("x[" + i + "] = " + x[i]);
            
            sum += Long.parseLong(x[i]);
        }
        
        System.out.println("n = " + n + "k = " + k);     
        
        
        
        
        // Multiply sum by k if sum <= Integer.MaxValue / k;
        if(sum <= Long.MAX_VALUE / k)
        {
            sum = sum * k;
            k = 1;
        }
        
        
        System.out.println("sum = " + sum);
        
        while(sum > 0)
        {
            Long remainder = sum % 10;
            sum = sum / 10;
            strBuffer.append(remainder);
        }
        
       // strBuffer = strBuffer.reverse();
        
        String str = strBuffer.toString();
        
        System.out.println("strBuffer = " + strBuffer);
        
        return digitSum(str, k);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = digitSum(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
