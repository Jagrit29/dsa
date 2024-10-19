package previous.abc375;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double points[][] = new double[n+2][2];
        points[0][0] = 0;
        points[0][1] = 0;
        points[n+1][0] = 0;
        points[n+1][1] = 0;
        for(int i=1;i<=n;i++) {
            points[i][0] = sc.nextDouble();
            points[i][1] = sc.nextDouble();
        }

        double distance = 0;

        for(int i=1;i<points.length;i++) {
            double x = Math.pow((points[i][0] - points[i-1][0]),2);
            double y = Math.pow((points[i][1]- points[i-1][1]), 2);
            double sq = Math.sqrt(x+y);
//            System.out.println(sq);
            distance += sq;
        }

        System.out.println(distance);
    }
}

