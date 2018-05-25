import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PageCount{

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int pageCount = (p/2);
        
        int pageCountFromBack = 0;
        
        if((n % 2) == 0)
            pageCountFromBack = (n-p+1)/2;
        else 
            pageCountFromBack = (n-p)/2;
        
        if(pageCountFromBack < pageCount)
            pageCount = pageCountFromBack;
        
        return pageCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}