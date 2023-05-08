import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    	
    	double plus=0;
    	double zero=0;
    	double minus=0;
    	double size=arr.size();
    
    	
        for(Integer number:arr) {
        	if (number>0) { plus=plus+1;}
        	if (number==0) { zero=zero+1;}
        	if (number<0) { minus=minus+1;}
        	        	        		
        	}
        double p1=plus/size;
        double p2=minus/size;
        double p3=zero/size;
    	
        System.out.printf("%f", p1);
        System.out.printf("\n%f", p2);
        System.out.printf("\n%f", p3);
        }
    // Write your code here

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
