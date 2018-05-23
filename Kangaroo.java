import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Kangaroo{

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        
        int position1 = x1;
        int position2 = x2;
        
        int flag = 0;
        
        // for each jump calculate and compare the positions of both kangaroos
        for(int i = 0,j = 0; v1 > v2 && position1 <= position2; i++, j++)
        {
           // position1 = x1 + v1 * i;
           // position2 = x2 + v2 * j;
            
            position1 = position1 + v1;
            position2 = position2 + v2;
            
            if(position1 == position2)
            {
                flag = 1;
                break;
            }                
            System.out.println(position1 + " " + position2);
        }

         System.out.println(position1 + " " + position2);
         if(flag == 1)
                return "YES";
            else
                 return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("E:/temp.txt")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}