class Solution {
    public int romanToInt(String s) {
        // smaller element is placed before greator;
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = map.get(s.charAt(0));

        for(int i=1;i<s.length();i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if(map.get(prev) < map.get(curr)) {
                ans += map.get(curr) - 2*map.get(prev);
            } else {
                ans += map.get(curr);
            }
        }

        return ans;
    }
}
