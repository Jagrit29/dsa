class Solution {
    public boolean isPalindrome(int x) {

        // negative number will always have neg side on the begining 
        if(x<0) return false;

        int originalX = x;
        int reversedX = 0;

        while(x>0) {
            int rem = x % 10;
            reversedX = reversedX * 10 + rem;
            x = x / 10;
        }

        // Time Complexity: O(Log10(X))
        // Space Complexity: 1
        return originalX == reversedX;
    }
}
