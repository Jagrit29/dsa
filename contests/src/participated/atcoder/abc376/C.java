package participated.atcoder.abc376;


import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n-1];

        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }

        for(int j=0;j<n-1;j++) {
            b[j] = sc.nextInt();
        }

        // 2 3 5 7
        // 2 6 8

        // 2 3 5 7
        // 1 6 8

        Arrays.sort(a);
        Arrays.sort(b);
        int ans = -1;

        boolean bt = false;
        int i = n-1;
        int j = n-2;
        while(i>=0 && j>=0) {
            if(a[i]<=b[j]) {
                i--;
                j--;
            } else {
                if(bt) {
                    ans = -1;
                    break;
                }
                ans = a[i];
                bt = true;
                i--;
            }
        }

        if(!bt) {
            ans = a[0];
        }

        System.out.println(ans);


    }
}
