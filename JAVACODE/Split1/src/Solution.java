import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        s=s.replaceAll("[^\\p{Alpha}]+"," ").trim();
        if(s.isEmpty()) {
            System.out.print("0");
            }else {
                String[] a=s.split("[\\s!,?._'@]+",0);
                if (a.length==0){
                    System.out.print("0");
                    }else{
                        System.out.println(a.length);
                        for (String i: a) {
                        System.out.println(i);
                         }  
                    }            
                 }
        
        
        
    }
}

