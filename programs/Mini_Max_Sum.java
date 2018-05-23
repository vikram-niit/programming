import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Mini_Max_Sum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
            long maxSum = 0;
            long minSum = 0;
        
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
        
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] > max)
                    max = arr[i];
                
                if(arr[i] < min)
                    min = arr[i];
            }
        
            long totalSum = 0;
            for(int i = 0; i < arr.length; i++)
            {
                totalSum += arr[i];
            }
        
            maxSum = totalSum - min;
            minSum = totalSum - max;
        
            System.out.println(minSum + " " + maxSum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}