class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<List<Integer>> list = new ArrayList<>();
        int st = intervals[0][0];
        int ed = intervals[0][1];

        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0]<=ed) {
                ed = Math.max(ed, intervals[i][1]);
            } else {
                list.add(Arrays.asList(st, ed));
                st = intervals[i][0];
                ed = intervals[i][1];
            }
        }

        list.add(Arrays.asList(st, ed));

        int ans[][] = new int[list.size()][2];

        for(int i=0;i<ans.length;i++) {
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }

        // TC : nlogn

        return ans;
    }
}
