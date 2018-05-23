import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class SockMerchant  {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
            HashMap map = new HashMap();
            
            int numberOfPairs = 0;
            for(int i = 0; i < n; i++)
            {
                // insert the sock into the map to find matching pair later
                if(!map.containsKey(ar[i]))
                    map.put(ar[i], 1);
                // if there is entry already in map match the sock and remove from map
                else
                {
                    numberOfPairs++;
                    map.remove(ar[i]);
                }
                    
            }
                    return numberOfPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
