import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PickingNumbers{

    // Complete the pickingNumbers function below.
    static int pickingNumbers(int[] a) {

        int maximumCount = Integer.MIN_VALUE;
        
        for(int i = 0; i < a.length; i++)
        {
            int count = 0;
            int count1 = 0;
            int count2 = 0;
            for(int j = 0; j < a.length; j++)
            {
                if((a[i] - a[j]) >=0 && (a[i] - a[j]) <= 1)
                    count1++;
                if((a[i] - a[j]) >=-1 && (a[i] - a[j]) <= 0)
                    count2++;
            }
            
            count = count1 > count2 ? count1 : count2;
            
            if(count > maximumCount)
                maximumCount = count;
        }
        
        return maximumCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
