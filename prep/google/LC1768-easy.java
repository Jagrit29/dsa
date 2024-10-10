class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        StringBuffer mergedString = new StringBuffer("");

        int at1 = 0;
        int at2 = 0;

        while(at1<len1 || at2<len2) {
            if(at1<len1) mergedString.append(word1.charAt(at1++));
            if(at2<len2) mergedString.append(word2.charAt(at2++));
        }

        return mergedString.toString();


    }
}
