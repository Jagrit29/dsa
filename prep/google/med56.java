class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<List<Integer>> list = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                list.add(Arrays.asList(start, end));
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        list.add(Arrays.asList(start, end));

        int size = list.size();
        int ans[][] = new int[size][2];
        for(int i=0;i<size;i++) {
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }

        return ans;
    }
}
