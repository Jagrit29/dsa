class Solution {
    List<String> list;
    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        solve(n, 0, 0, "");

        return list;
    }

    public void solve(int n, int o, int c, String comb) {
        if(o > n || c > o) return;

        if(comb.length() == 2*n) {
            list.add(comb);
        }

        solve(n, o+1, c, comb+"(");
        solve(n, o, c+1, comb +")");
    }
}
