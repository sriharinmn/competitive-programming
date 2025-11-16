public class Karatsuba {

    // Method to multiply two numbers using Karatsuba's algorithm
    public static long karatsuba(long x, long y) {
        // Base case: when the numbers are small enough to be multiplied directly
        if (x < 10 || y < 10) {
            return x * y;
        }
        
        // Calculate the number of digits in the largest number
        int m = Math.max(String.valueOf(x).length(), String.valueOf(y).length());
        int half = m / 2;

        // Split the numbers into two halves
        long high1 = x / (long)Math.pow(10, half);
        long low1 = x % (long)Math.pow(10, half);
        long high2 = y / (long)Math.pow(10, half);
        long low2 = y % (long)Math.pow(10, half);

        // Recursively calculate three products
        long z0 = karatsuba(low1, low2); // Low part multiplication
        long z1 = karatsuba(low1 + high1, low2 + high2); // Cross terms multiplication
        long z2 = karatsuba(high1, high2); // High part multiplication

        // Combine the three results using the formula
        long result = z2 * (long)Math.pow(10, 2 * half) + (z1 - z2 - z0) * (long)Math.pow(10, half) + z0;

        return result;
    }

    public static void main(String[] args) {
        long x = 1234;
        long y = 5678;
        System.out.println("Multiplication result: " + karatsuba(x, y));
    }
}
