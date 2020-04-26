import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lenA = A.length();
        int lenB = B.length();
        System.out.println(lenA+lenB);

        int charA = A.charAt(0) - 'a';

        int charB = B.charAt(0) - 'a';

        if(charA > charB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String newA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String newB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(newA + " " + newB);
    }
}
