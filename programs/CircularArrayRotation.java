import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CircularArrayRotation{

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int[] m, int k) {

            int[] newArray = new int[a.length];
            int[] indexArray = new int[m.length];
            int[] tempArray = new int[a.length];
        
            tempArray = a;
       /* 
        while(k > 0)
        {
            newArray = new int[a.length];
                 // Make the last element of the array a as the first element of newArray
            newArray[0] = tempArray[tempArray.length - 1];
            for(int i = 0; i < a.length - 1; i++)
            {
                newArray[i+1] = tempArray[i];
            }
            
            tempArray = newArray;
            
            k--;
        }
        */
        /*
            // Rotate the last k elements of the array a as the first k elements of newArray
            for(int i = 0; i < k; i++)    
            {
                newArray[i] = tempArray[tempArray.length - (k-i)];
            }       
            
            for(int i = 0; i < a.length - k; i++)
            {
                newArray[i+k] = tempArray[i];
            }
          */
        
        int index = 0;
        for(int i = 0; i < a.length; i++)
        {
            index = (i - k) % a.length;
            
            if(index < 0)
                index += a.length;
            
            newArray[i] = a[index];
        }
          
            for(int i = 0; i < m.length; i++)
            {
                indexArray[i] = newArray[m[i]];
            }
       
        
        return indexArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] m = new int[q];

        for (int i = 0; i < q; i++) {
            int mItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            m[i] = mItem;
        }

        int[] result = circularArrayRotation(a, m, k);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
