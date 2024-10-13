class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int st = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        int max = 0;

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);

            while(hm.size() > 2) {
                char sch = s.charAt(st++);
                hm.put(sch, hm.getOrDefault(sch, 0)-1);

                if(hm.get(sch)<=0) hm.remove(sch);
            }

            max = Math.max(max, i - st + 1);
        }

        return max;
    }
}
