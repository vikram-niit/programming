import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class QuickSort1{

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {

        int pivot = arr[0];
        
        int i = 0;
        int j = arr.length - 1;
        
        while(i <= j)
        {
            while((i < arr.length) && (arr[i] <= pivot))
            {
                i++;
            }
            
            while((j >= 0) && (arr[j] > pivot))
            {
                j--;
            }
            
            if(i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }            
        }
        
        // swap a[j] with pivot
        int temp = arr[j];
        arr[j] = arr[0];
        arr[0] = temp;
        
        // Split the partition left into left and equal
        
            i = 0;
        
        while(i <= j)
        {
            while((i < arr.length) &&(arr[i] < pivot) )
                i++;
            
            System.out.println("j = " + j);
            while((j>=0) && (arr[j] == pivot))
                j--;
            
             System.out.println("j = " + j);
            
            if(i < j)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = quickSort(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
