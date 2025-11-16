//int[][] matrix = new int[rows][cols];

public class HourglassSum {

    public static int maxHourglassSum(int[][] matrix) {
        int n = matrix.length;        // rows
        int m = matrix[0].length;     // cols
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {
                int sum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] // top
                        + matrix[i+1][j+1]                               // middle
                        + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2]; // bottom
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };

        System.out.println("Maximum hourglass sum: " + maxHourglassSum(matrix));
    }
}

