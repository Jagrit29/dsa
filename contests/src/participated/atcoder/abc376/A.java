package participated.atcoder.abc376;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int time[] = new int[n];

        for(int i=0;i<n;i++) {
            time[i] = sc.nextInt();
        }

        int count = 0;
        int lastGot = -1;

        for(int i=0;i<n;i++) {
            if(i==0) {
                count++;
                lastGot = time[i];
            } else {
                if(time[i] - lastGot >= c) {
                    count++;
                    lastGot = time[i];
                }
            }
        }

        System.out.println(count);
    }
}
