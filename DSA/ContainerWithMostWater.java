public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int n = height.length;
        int cap = 0;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            // Calculate area between i and j, constrained by the shorter line
            int area = (j - i) * Math.min(height[i], height[j]);
            cap = Math.max(cap, area);

            // Move the pointer at the shorter line inward
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return cap;
    }

    // Example main method for testing
    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        int[] height = {1,8,6,2,5,4,8,3,7};

        int maxWater = solution.maxArea(height);
        System.out.println("The maximum area is: " + maxWater);
    }
}