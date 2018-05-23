import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit{
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        double[] bill = new double[100000];
        
        // read first line
        String input = reader.readLine().trim();
        
        double n = Double.parseDouble(input.split(" ")[0].trim());
        double k = Double.parseDouble(input.split(" ")[1].trim());
                      
        // read second line
        input = reader.readLine().trim();
        
        String[] inputs = input.split(" ");
        
        for(int i = 0; i < n; i++)
        {
            bill[i] = Double.parseDouble(inputs[i].trim());
        }
        
        // read third line
        input = reader.readLine();
        
        Double bCharged = Double.parseDouble(input.split(" ")[0]);     
        
        // compute bActual
        Double bActual = 0.0;
        for(int i = 0; i < n; i++)
        {
            if(i == k)
                continue;
            
            bActual += bill[i];
        //    System.out.println(bill[i] + " " + bActual);
        //    System.out.println(i);
        }
        
        bActual = bActual / 2;
        
        double difference = ((bCharged - bActual));
        
       
        
        if((bCharged - bActual) == 0.0)
            System.out.println("Bon Appetit");
        else
            System.out.println((int)difference);
        
       // System.out.println("bCharged = " + bCharged);
       // System.out.println("bActual = " + bActual);
        
    }
}