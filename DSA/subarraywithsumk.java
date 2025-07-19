public class SubarrayWithSumK {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        // Compute prefix sum in a separate array to avoid modifying the original array
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 0; // Initial prefix sum for ease of calculation

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        // Iterate through all possible subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if ((prefixSum[j + 1] - prefixSum[i]) == k) {
                    count++;
                }
            }
        }

        return count;
    }

    // Example main method to test the solution
    public static void main(String[] args) {
        SubarrayWithSumK solution = new SubarrayWithSumK();

        int[] nums = {1, 2, 3};
        int k = 3;

        int result = solution.subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + " is: " + result);
    }
}