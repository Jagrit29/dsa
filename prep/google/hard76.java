class Solution {
    public String minWindow(String s, String t) {
        int st = 0;
        int mI = 0;
        int mL = Integer.MAX_VALUE;

        int ft[] = new int[256];
        int win[] = new int[256];
        for(char ch: t.toCharArray()) ft[ch]++;

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            win[ch]++;

            while(validWin(ft, win)) {
                int len = i - st + 1;
                if(len<mL) {
                    mL = len;
                    mI = st;
                }
                win[s.charAt(st++)]--;
            }
        }

        if(mL == Integer.MAX_VALUE) return "";
        return s.substring(mI, mI+mL);
    }

    public boolean validWin(int fre[], int win[]) {
        for(int i=0;i<256;i++) {
            if(fre[i] > win[i]) return false;
        }

        return true;
    }
}
