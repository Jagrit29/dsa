class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        int ib = 0;
        int jb = 0;
        StringBuffer bf = new StringBuffer("");
        StringBuffer bf2 = new StringBuffer("");

        while(i>=0) {
            if(s.charAt(i)=='#') {
                ib++;
                i--;
            } else {
                if(ib>0) {
                    i--;
                    ib--;
                } else {
                    bf.append(s.charAt(i));
                    i--;
                }
            }
        }

        while(j>=0) {
            if(t.charAt(j)=='#') {
                jb++;
                j--;
            } else {
                if(jb>0) {
                    jb--;
                    j--;
                } else {
                    bf2.append(t.charAt(j));
                    j--;
                }
            }
        }

        return bf.reverse().toString().equals(bf2.reverse().toString());

    }
}
