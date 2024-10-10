class Solution {
    public Integer dp[];
    public int climbStairs(int n) {
        dp = new Integer[n];
        return countSteps(n, 0);
    }

    public int countSteps(int n, int i) {
        if(i>n) return 0;
        if(i>=n) return 1;

        if(dp[i]!=null) return dp[i];

        int op1 = countSteps(n, i+1);
        int op2 = countSteps(n, i+2);

        return dp[i] = op1 + op2;
    }

    // TC: O(n)
}
