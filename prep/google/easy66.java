class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int carry = 1;
        for(int i=digits.length-1;i>=0;i--) {
            int num = digits[i] + carry;
            list.add(num%10);
            carry = num/10;
        }
        if(carry!=0) {
            list.add(carry);
        }

        int ans[] = new int[list.size()];
        for(int i=list.size()-1;i>=0;i--) {
            ans[list.size() - (i+1)] = list.get(i);
        }

        return ans;
    }
}
