class Solution {
    public int totalFruit(int[] fruits) {
        // fruit trees 
        // type of fruit 
        // as many as possible;
        // only two baskets 
        // unique chars in a window should be 2;
        // sliding window;
        HashMap<Integer, Integer> window = new HashMap<>();
        int maxCount = 0;
        int start = 0;

        for(int i=0;i<fruits.length;i++) {
            window.put(fruits[i], window.getOrDefault(fruits[i], 0)+1);
            
            while(window.size() > 2) {
                // window size is 2;
                window.put(fruits[start], window.getOrDefault(fruits[start],0)-1);
                if(window.get(fruits[start]) == 0){
                    window.remove(fruits[start]);
                }
                start++;
            }

            maxCount = Math.max(maxCount, i - start + 1);
        }

        return maxCount;
    }
}
