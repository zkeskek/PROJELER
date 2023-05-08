import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        //String days= new Array(7);
        String days[]={"SUNDAY","MONDAY", "TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        
        int[] monthDays={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int lastYearDays=0;
        for(int i=0;i<month;i++){
        lastYearDays=lastYearDays+monthDays[i];
         }
        int totalDays=((year*365)+(int)Math.floor(year/4)+lastYearDays+day+5);
        if((month==2)&&(day==29)) {totalDays=totalDays-1;}
        int dayNumber=totalDays%7;
        String dayofName=days[dayNumber];
        return dayofName;
     }

}

public class Solution {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        System.out.println(res);

        //bufferedWriter.write(res);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
