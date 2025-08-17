import java.math.BigInteger;
import java.util.Scanner;




public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        for(int i = L; i<=R;i++){
            if(BigInteger.valueOf(i).isProbablePrime(10)){
                System.out.print(i + " ");
            }
        }
    }
}