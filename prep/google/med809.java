class Solution {
    public int expressiveWords(String s, String[] words) {
        // brute force check for each string;
        int n = s.length();
        int count = 0;
        for(String word: words) {
            int m = word.length();
            int i = 0;
            int j = 0;
            boolean pos = true;

            while(i<n && j<m) {
                if(s.charAt(i)!=word.charAt(j)) {
                    pos = false;
                    break;
                } 

                int sc = 1;
                int wc = 1;

                // to get repeatedLength
                while(i+1<n && s.charAt(i)==s.charAt(i+1)) {
                    sc++;
                    i++;
                }

                // to get repeatedLength
                while(j+1<m && word.charAt(j)==word.charAt(j+1)) {
                    wc++;
                    j++;
                }

                if(sc<wc || (sc>wc && sc<=2)) {
                    pos = false;
                    break;
                }

                i++;
                j++;
            }

            // System.out.println(word+" "+i+" "+j);
            if(i<n || j<m) {
                pos = false;
            }

            if(pos) {
                count++;
            }
        }

        return count;
    }
}
