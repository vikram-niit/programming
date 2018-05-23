import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int n, int[] ar) {
            int[] count = new int[6];
        
            for(int i = 0; i < ar.length; i++)
                count[ar[i]]++;
        
            // find max value in array count
            int max = Integer.MIN_VALUE;
            int index = 0;
        
            for(int i = 0; i < count.length; i++)
            {
                if(count[i] > max)
                {
                     max = count[i];
                     index = i;
                }                   
            }
                
            return index;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr]);
            ar[arItr] = arItem;
        }

        int n = ar.length;
         
        int result = migratoryBirds(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}