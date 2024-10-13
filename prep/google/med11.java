class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxWater = 0;

        while(i<=j) {
            int minHeight = Math.min(height[i], height[j]);
            int water = (j-i)*minHeight;
            maxWater = Math.max(maxWater, water);

            if(height[i]<=height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxWater;
    }
}
