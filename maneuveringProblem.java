public int uniquePaths(int m, int n) {
    int N = m + n - 2;   // total moves
    int r = Math.min(m - 1, n - 1); // choose the smaller side for safety
    double res = 1.0;

    for (int i = 1; i <= r; i++) {
        res = res * (N - r + i) / i;
    }

    return (int) Math.round(res); // safer than plain cast
}
