import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean n = sc.nextInt();

        int[] arr = new int[n+1];

        Arrays.fill(arr, true);

        arr[0] = false;
        arr[1] = false;

        for(int i = 2; i*i <=n ; i++){
            if(arr[i]){
                for(int j = i*i;j<=n ; j+=i) {
                    arr[j] = false;

                }
            }
        }

        for(int i = 0; i <= n; i++) {
            if(arr[i]) {
                System.out.print(i + " ");
            }
        }


    }
}