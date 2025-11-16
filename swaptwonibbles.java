import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int binary = String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');

        String leftnibble = binary(0,4);
        String rightnibble = binary(4);

        String swapper = rightnibble + leftnibble;

        System.out.printf("original number : %d\n", n);
        System.out.printf("after swapping : %d\n", Integer.parseInt(swapper,2));
        System.out.printf("binary representation : %s\n", binary);
        System.out.printf("after swapping binary representation : %s\n", swapper);
    }
}