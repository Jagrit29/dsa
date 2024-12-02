package participated.atcoder.abc376;


import java.util.*;

class Pair {
    int a;
    int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int ti=0;ti<t;ti++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int a[] = new int[n];
            int b[] = new int[n];

            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++) {
                b[i] = sc.nextInt();
            }

            Pair p[] = new Pair[n];
            for(int i=0;i<n;i++) {
                p[i] = new Pair(a[i], b[i]);
            }

            Arrays.sort(p, (aa, bb) -> aa.a - bb.a); // sorted based on the first element;
            PriorityQueue<Long> pq = new PriorityQueue<>((pa, pb) -> pb.compareTo(pa));

            long ans = Long.MAX_VALUE;
            long sum = 0;
            for(int i=0;i<n;i++) {
                long max = p[i].a;
                if(i>=k) {
                    // enough elements;
                    long lastSum = pq.poll(); // remove the last sum;
                    sum -= lastSum;

                }
                sum += (long)p[i].b;
                pq.add((long)p[i].b);
                if(pq.size()>=k) {
                    ans = Math.min(ans, (long)(max*sum));
                }
            }

            System.out.println(ans);


        }

    }
}

/*
3 7 6
9 2 4
5 3
6 4 1 5 9
8 6 5 1 7

3 6 7
9 2 4


 */
