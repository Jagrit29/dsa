class Solution {
    public int majorityElement(int[] nums) {
        // using HashMap
        int majorityElement = nums[0];
        int count = 1;

        for(int i=1;i<nums.length;i++) {
            if(majorityElement!=nums[i]) {
                count -= 1;
            } else {
                count += 1;
            }

            if(count == 0) {
                majorityElement = nums[i];
                count = 1;
            }
        }

        return majorityElement;
    }
}
