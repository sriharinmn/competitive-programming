import java.util.Scanner;

public class BinaryPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Convert integer to binary string
        String binaryStr = Integer.toBinaryString(num);
        System.out.println("Binary representation: " + binaryStr);

        // Reverse the binary string
        String reversedStr = new StringBuilder(binaryStr).reverse().toString();

        // Check if palindrome
        if (binaryStr.equals(reversedStr)) {
            System.out.println("The binary representation is a palindrome.");
        } else {
            System.out.println("The binary representation is NOT a palindrome.");
        }

        sc.close();
    }
}
