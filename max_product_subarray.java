public class MaxProductSubarray {

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            if (curr < 0) {
                // Swap max and min when multiplied by negative
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(curr, maxProduct * curr);
            minProduct = Math.min(curr, minProduct * curr);

            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums));
    }
}
