class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        int st[] = new int[n];
        int ed[] = new int[n];

        for(int i=0;i<n;i++) {
            st[i] = intervals[i][0];
            ed[i] = intervals[i][1];
        }

        Arrays.sort(st);
        Arrays.sort(ed);

        int i = 0;
        int j = 0;
        int maxRooms = 0;
        int rooms = 0;
        while(i<n && j<n) {
            if(st[i]<ed[j]) {
                rooms++;
                i++;
            } else {
                j++;
                rooms--;
            }
            maxRooms = Math.max(rooms, maxRooms);
        }

        return maxRooms;


    }
}
