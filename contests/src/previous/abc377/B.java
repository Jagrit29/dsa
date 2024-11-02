package previous.abc377;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grid[][] = new char[8][8];
        for(int i=0;i<8;i++) {
            grid[i] = sc.next().toCharArray();
        }
        int count = 0;
        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                if(grid[i][j]=='.') {
                    // check if there i no character in this row and grid;
                    boolean row = true;
                    boolean col = true;

                    for(int k=0;k<8;k++) {
                        if(grid[i][k]=='#') {
                            row = false;
                        }
                    }

                    for(int k=0;k<8;k++) {
                        if(grid[k][j]=='#') {
                            col = false;
                        }
                    }

                    if(row && col) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
