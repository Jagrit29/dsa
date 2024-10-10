class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalLen = nums1.length;
        int placeAt = totalLen - 1;

        int first = m-1;
        int second = n-1;

        while(first>=0 && second>=0) {
            if(nums1[first]>=nums2[second]) {
                nums1[placeAt] = nums1[first];
                placeAt--;
                first--;
            } else {
                nums1[placeAt] = nums2[second];
                placeAt--;
                second--;
            }
        }

        while(first>=0) {
            nums1[placeAt--] = nums1[first--];
        }

        while(second>=0) {
            nums1[placeAt--] = nums2[second--];
        }

        // Time Complexity - O(n+m);
        // Space Complexity - O(1);
    }
}
