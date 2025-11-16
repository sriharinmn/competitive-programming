// Left shift array by k positions
    public static void leftShift(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // in case k > n
        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }

// Right shift array by k positions
    public static void rightShift(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // in case k > n
        for (int i = 0; i < k; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }