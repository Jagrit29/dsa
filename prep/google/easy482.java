class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int groupSize = 0;
        StringBuffer ans = new StringBuffer("");
        int n = s.length();

        for(int i = n-1;i>=0;i--) {
            if(s.charAt(i) == '-') continue;
            if(groupSize == k) {
                ans.append("-");
                groupSize = 0;
            }
            ans.append(s.charAt(i));
            groupSize++;
        }

        // ans.toUpperCase();

        return ans.reverse().toString().toUpperCase();
    }
}
