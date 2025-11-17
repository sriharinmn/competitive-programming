public class Josephus {
    // returns the safe position (1-indexed) for n people and step k
    public static int josephus(int n, int k) {
        int result = 0; // f(1,k) = 0 (0-indexed)
        for (int i = 2; i <= n; i++) {
            result = (result + k) % i;
        }
        return result + 1; // convert to 1-indexed
    }

    // Example usage
    public static void main(String[] args) {
        int n = 7; // number of people
        int k = 3; // eliminate every k-th person
        System.out.println("Safe position: " + josephus(n, k)); // prints 4 for n=7,k=3
    }
}
