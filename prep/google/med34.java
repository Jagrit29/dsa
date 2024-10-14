class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstPosition(nums, target), lastPosition(nums, target)};
    }

    public int firstPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low<=high) {
            int mid = high - (high-low)/2;
            if(nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public int lastPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low<=high) {
            int mid = high - (high-low)/2;
            if(nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
