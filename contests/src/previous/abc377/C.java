package previous.abc377;

import java.util.HashSet;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int m = sc.nextInt();

        int pieces[][] = new int[m][2];

        for(int i=0;i<m;i++) {
            pieces[i][0] = sc.nextInt();
            pieces[i][1] = sc.nextInt();
        }

        // now total palces I know;
        long total = n*n; // total palces;
        // these are already palced;

        // now find the unique numbers that each of m can attack;
        HashSet<String> unique = new HashSet<>();

        for(int piece[]: pieces) {
            int x = piece[0];
            int y = piece[1];
            String s = x +":" +y;
            unique.add(s);
            int dx[] = {2,1,-1,-2,-2,-1,1,2};
            int dy[] = {1,2,2,1,-1,-2,-2,-1};

            for(int d=0;d<8;d++) {
                int xx  = dx[d] + x;
                int yy = dy[d] + y;

                if(xx>=1 && xx<=n && yy>=1 && yy<=n) {
                    String ss = xx +":" +yy;
                    unique.add(ss);
                }
            }

        }

        System.out.println(total - unique.size());
    }
}
