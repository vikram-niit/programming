import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion  {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
       String[] arrStrings = s.split(":");
        
        Integer hh = Integer.parseInt(arrStrings[0]);
        
        String ampm = s.substring(8, 10);      
        
        
        if(ampm.equals("PM") && hh != 12)
            hh = (hh + 12) % 24 ;
        
         if(ampm.equals("AM") && hh == 12)
            hh = 00 ;
        
         StringBuffer strBuffer = new StringBuffer();
        
        
        
        // add leading zero
        if(hh < 10)
         strBuffer.append(0);
       
        
       
       
        strBuffer.append(hh);
        strBuffer.append(":");
        strBuffer.append(arrStrings[1]);
        strBuffer.append(":");
        strBuffer.append(s.substring(6, 8));
        
     
        
        return strBuffer.toString();

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}