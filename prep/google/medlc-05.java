class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int si = 0;
        int ml = 1;
        for(int i=0;i<n-1;i++) {
            int odd[] = solve(s, i, i);
            int even[] = solve(s, i, i+1);

            int oddLen = odd[1] - odd[0] + 1;
            int evenLen = even[1] - even[0] + 1;

            if(oddLen > ml) {
                si = odd[0];
                ml = oddLen;
            }

            if(evenLen > ml) {
                si = even[0];
                ml = evenLen;
            }
        }

        return s.substring(si, si+ml);
    }

    public int[] solve(String s, int i, int j) {
        int n = s.length();
        while(i>=0 && j<n) {
            if(s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else {
                break;
            }
        }

        return new int[]{i+1, j-1};
    }
}
