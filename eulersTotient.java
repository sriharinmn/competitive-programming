import java.util.Scanner;




public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int result = n;

        for(int p = 2; p*p <=n ;p++){
            if(n%p==0){
                while(n%-==0) {
                    n /= p;
                }
                result -=result/p;
            }
        }

        if(n>1){
            result -= result /n;
        }

        System.out.println("eulers totient" + result);
        sc.close();


    }
}