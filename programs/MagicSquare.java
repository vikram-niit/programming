import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MagicSquare{

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {

        // There are totally 8 possible normal magic squares for n = 3
        // magic constant = 15
        
        // Calculate the sum of the absolute differences of each element 
        // of the given square with all the 8 possible normal magic squares
        // Choose the minimum sum
        
        int[][][] M = {
            {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        },
        
        {
            {6, 1, 8},
            {7, 5, 3},
            {2, 9, 4}
        },
        
        {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        },
        
        {
            {4, 3, 8},
            {9, 5, 1},
            {2, 7, 6}
        },
        
        {
            {2, 9, 4},
            {7, 5, 3},
            {6, 1, 8}
        },
        
        {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        },
        
        {
            {6, 7, 2},
            {1, 5, 9},
            {8, 3, 4}
        },
        
        {
            {8, 3, 4},
            {1, 5, 9},
            {6, 7, 2}
        },
    };
        
        int minimumSum = Integer.MAX_VALUE;
        for(int i = 0; i < 8; i++)
        {
            int sum = 0;
            for(int j = 0; j < 3; j++)
            {
                for(int k = 0; k < 3; k++)
                {
                    sum += Math.abs(M[i][j][k] - s[j][k]);
                }
            }
            
            if(sum < minimumSum)
                minimumSum = sum;
        }
            
            return minimumSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
