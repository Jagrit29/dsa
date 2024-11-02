package previous.abc378;


import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        char grid[][] = new char[n][m];

        for(int i=0;i<n;i++) {
            grid[i] = sc.next().toCharArray();
        }
        int count = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == '.') {
                    count += dfs(grid, i, j, k);
                }
            }
        }

        System.out.println(count);
    }

    public static int dfs(char grid[][], int i, int j, int k) {
        int n = grid.length;
        int m = grid[0].length;
        if(i<0 || i>=n || j<0 || j>=m) return 0;
        if(k==0) return 1; // reached a point such that it is a valid one;
        if(grid[i][j] == '#') return 0;

        int dx[] = {0,0,1,-1};
        int dy[] = {1,-1,0,0};

        int ans = 0;
        grid[i][j] = '#';
        for(int d=0;d<4;d++) {
            int ii = i + dx[d];
            int jj = j + dy[d];

            if(ii>=0 && ii<n && jj>=0 && jj<m) {
                if(grid[ii][jj] == '.') {
                    ans = ans + dfs(grid, ii, jj, k-1);
                }
            }
        }
        grid[i][j] = '.';

        return ans;
    }
}

