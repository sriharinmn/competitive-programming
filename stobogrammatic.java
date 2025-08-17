import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter a number: ");

        String num = Integer.toString(n);

        int left = 0, right = num.length() - 1;

        boolean flag = true;

        while(left<=right) {
            char l = num.charAt(left);
            char r = num.charAt(right);

            if((l=='0' && r=='0') || (l=='1' && r=='1') || (l=='8' && r=='8') || (l=='6' && r=='9') || (l=='9' && r=='6')) {
                left++;
                right--;

            }
            else {
                flag = false;
                break;
            }
        }
        
        if(flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();

    }
}