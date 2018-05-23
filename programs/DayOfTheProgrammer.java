import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DayOfTheProgrammer{

    // Complete the solve function below.
    static String solve(int year) {
        // compute the 256th day (day of the programmer)
        
        int mm = 0; 
        int dd = 256;
        int feb = 0;
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int i = 0;
        // if year < 1918
            if(year < 1918)
            {
                if(isJulianLeapYear(year))
                    months[1] = 29;                
                
                i = 0;
               while(dd >31)
               {
                   mm++;
                   dd -= months[i];   
                   i++;
               }
            }
        // if year == 1918
            if(year == 1918)
            {
                if(isGregorianLeapYear(year))
                    months[1] = 29 - 14 + 1;                
                else
                    months[1] = 28 - 14 + 1;
                
               i = 0;
               while(dd >31)
               {
                   mm++;
                   dd -= months[i];    
                   i++;
               }
            }
        // if year > 1918
            if(year > 1918)
            {
                if(isGregorianLeapYear(year))
                    months[1] = 29;                
                
                i = 0;
               while(dd >31)
               {
                   mm++;
                   dd -= months[i];                   
                   i++;
               }
            }  
            
             if(mm == 9 && dd > 30)
             {
                mm++;
                dd -= 30;
             } 
        
              mm++;  
            
        
            StringBuffer strBuffer = new StringBuffer();
        
            if(dd < 10)
                 strBuffer.append(0);
        
            strBuffer.append(dd);
            strBuffer.append(".");
        
            if(mm < 10)
                strBuffer.append(0);
        
            strBuffer.append(mm);
            strBuffer.append(".");
            strBuffer.append(year);       
        
            return strBuffer.toString();
    }
    
    static boolean isJulianLeapYear(int year)
    {
        return (year % 4 == 0);        
    }

    
    static boolean isGregorianLeapYear(int year)
    {
        if(year % 100 == 0 && year % 400 == 0)
            return true;
        if(year % 100 !=0 && year % 4 == 0)
            return true;
        
        return false;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = solve(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}