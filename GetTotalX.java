import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GetTotalX{

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        
        int count = 0;
        int i = 0;
        
        int max = Integer.MIN_VALUE;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        // find maximum value in a
        for(i = 0; i < a.length; i++)
            if(a[i] > max)
                max = a[i];
        
        int min = Integer.MAX_VALUE;
        
        // find minimum value in b
        for( i = 0; i < b.length; i++)
            if(b[i] < min)
                min = b[i];
        
          
        
        
        // for each integer between min and max
        for( i = max; i <= min; i++)
        {
            int flag1 = 1;
            int flag2 = 1; 
            
            System.out.print(i +" ");
            for( int j = 0; j < a.length; j++)
            {
                if((i % a[j]) != 0)
                    flag1 = 0;
                
                System.out.println(i % a[j]);
            }
                
            
            for( int k = 0; k < b.length; k++)
                if((b[k] % i) != 0)
                    flag2 = 0;
            
            if(flag1 == 1 && flag2 == 1)
               count++;           
        }
        
        
        System.out.println(max + " " + min);
            return count;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("E:/temp.txt")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}