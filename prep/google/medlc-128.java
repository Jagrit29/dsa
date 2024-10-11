class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i: nums) hs.add(i);
        int maxLen = 0;

        for(int i: hs) {
            if(!hs.contains(i-1)) {
                int j = i;
                while(hs.contains(j)) {
                    j++;
                }
                maxLen = Math.max(maxLen, j-i);
            }
        }

        return maxLen;
    }
}
