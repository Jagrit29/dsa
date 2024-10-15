class Solution {
    List<String> combs;
    public List<String> letterCombinations(String digits) {
        // numbers to letter;
        // each number represents something;
        combs = new ArrayList<>();
        String digitsMap[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(digits, digitsMap, 0, "");

        return combs;
    }

    public void backtrack(String digits, String[] digitsMap, int at, String comb) {
        int n = digits.length();
        if(at == n) {
            if(comb.length() == n && !comb.equals("")) {
                combs.add(comb);
            }
            return;
        }

        String letters = digitsMap[(int)(digits.charAt(at)-'0')];
        for(char ch: letters.toCharArray()) {
            backtrack(digits, digitsMap, at+1, comb+""+ch);
        }
    }

    // choices ^ something 
    // 4 ^ N x N
    // 4^4
}
