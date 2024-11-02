package previous.abc378;


import java.util.*;

public class B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int qr[][] = new int[n][2];

        for(int i=0;i<n;i++) {
            qr[i][0] = sc.nextInt();
            qr[i][1] = sc.nextInt();
        }

        int q = sc.nextInt();
        for(int i=0;i<q;i++) {
            int gt = sc.nextInt();
            int d  = sc.nextInt();

            int mod = d % qr[gt-1][0];
            if(mod == qr[gt-1][1]) {
                System.out.println(d);
            } else {
                if(mod<qr[gt-1][1]) {
                    System.out.println(d + (qr[gt-1][1] - mod));
                } else {
                    System.out.println(d + (qr[gt-1][0] - mod) + qr[gt-1][1]);
                }
            }

        }

    }
}


