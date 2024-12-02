package participated.atcoder.abc379;


import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x[] = new int[m];
        long a[] = new long[m];

        long arr[] = new long[n];
        long stones = 0;

        for(int i=0;i<m;i++) {
            x[i] = sc.nextInt();
        }

        for(int i=0;i<m;i++) {
            a[i] = sc.nextLong();
            stones += a[i];
        }

        for(int i=0;i<m;i++) {
            arr[x[i]-1] = a[i];
        }

        if(stones != n) {
            System.out.println(-1);
            return;
        }

        long count = 0;
        long extra = 0;
        for(int i=0;i<m;i++) {
            if(arr[i] == 0) {
                if(extra == 0) {
                    System.out.println(-1);
                    return;
                }
                extra--;
                count = (long)(count + extra);
            } else {
                extra = extra + (arr[i] - 1);
                if(extra > 0) {
                    count  = (long)(count + extra);
                }
            }
        }



        System.out.println(count);


    }
}
//        for(int i=0;i<n;i++) {
//            if(arr[i] == 0) {
//                if(stack.isEmpty()) {
//                    System.out.println(-1);
//                    return;
//                }
//
//                long take[] = stack.pop();
//                count += (i - take[1]);
//                take[0]--;
//                if(take[0]!=0) {
//                    stack.push(new long[]{take[0], take[1]});
//                }
//
//            } else {
//                long extra = arr[i] - 1;
//                if(extra!=0) {
//                    stack.push(new long[]{extra, i});
//                }
//            }
//        }

// 1 2 3 4 5
// 4 0 2 0 0

//   3

