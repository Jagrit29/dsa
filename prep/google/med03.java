class Solution {
    public int lengthOfLongestSubstring(String s) {
        int window[] = new int[256];
        int start = 0;
        int maxLen = 0;

        for(int i=0;i<s.length();i++) {
            window[s.charAt(i)]++;

            while(window[s.charAt(i)]>1) {
                window[s.charAt(start++)]--;
            }

            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }
}
