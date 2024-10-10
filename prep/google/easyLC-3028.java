class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int boundaryCount = 0;
        int antPosition = 0;

        for(int i=0;i<nums.length;i++) {
            antPosition += nums[i];

            if(antPosition == 0){
                boundaryCount += 1;
            }
        }

        return boundaryCount;
    }
}
