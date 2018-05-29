import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertionSort1{

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {

        int element = arr[n-1];
        
        int j = n - 2;
        
        while(j>=0 && element < arr[j])
        {
            arr[j+1] = arr[j];
            
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            j--;
        }
        
        arr[j+1] = element;
         for(int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}
