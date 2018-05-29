import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class UnboundedKnapsack{

    // Complete the unboundedKnapsack function below.
    static int unboundedKnapsack(int k, int[] arr) {

        int[][] v = new int[arr.length+1][k+1];
        
        // initialize all elements of the first column to zero
        for(int i = 0; i <= arr.length; i++)
        {
            v[i][0] = 0;            
        }
        
        // initialize all elements of the first row to zero
        for(int i = 0; i <= k; i++)
        {
            v[0][i] = 0;
        }
            
       
        for(int i = 1; i <= arr.length; i++)
        {
             int j = 1;
            
            while(j <= k)
            {
                if((j >= arr[i-1]))
                {
                       v[i][j] = Math.max(v[i-1][j], v[i-1][j-arr[i-1]] + arr[i-1]);
                    
                        v[i][j] = Math.max(v[i][j], v[i][j-arr[i-1]] + arr[i-1]);
                   // System.out.print("v[i][j] = " + v[i][j] + "i=" + i +"j=" + j);
                     System.out.print(arr[i-1]);
                }     
                else
                {
                       v[i][j] = v[i-1][j];    
                }
                
               // System.out.print("v[i][j] = " + v[i][j] + "i=" + i +"j=" + j);
                
                j++;                
            }
            System.out.println();
        }
       /*            
        for(int i = 0; i <= arr.length; i++)
        {
            for(int j = 0; j <= k; j++)
            {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }*/
        
                   return v[arr.length][k];

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int j = 0; j < t; j++)
        {
            String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

        int result = unboundedKnapsack(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        }
        
        

        bufferedWriter.close();

        scanner.close();
    }
}
