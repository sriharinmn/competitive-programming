public class AppleCollection {
    public static int minApples(int M, int K, int N, int S, int W, int E) {
        // If we can collect all required apples from South trees
        if (M <= S * K)
            return M;

        // If we need more apples and can collect from East and West trees
        else if (M <= S * K + E + W)
            return S * K + (M - S * K);

        // If we don't have enough red apples
        else
            return -1;
    }

    public static void main(String[] args) {
        int M = 10; // Required red apples
        int K = 15; // Red apples per South tree
        int N = 0;  // North trees (not used)
        int S = 1;  // South trees
        int W = 0;  // West trees
        int E = 0;  // East trees

        int result = minApples(M, K, N, S, W, E);
        System.out.println("Minimum apples to collect: " + result);
    }
}
