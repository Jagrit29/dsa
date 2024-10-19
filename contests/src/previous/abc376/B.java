package previous.abc376;


import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int arr[] = new int[n];
        arr[0] = 1; // L
        arr[1] = 2; // R;
        int ans = 0;

        for(int i=0;i<q;i++) {
            char ch = sc.next().charAt(0);
            int move = ch == 'L' ? 1 : 2;
            int target = sc.nextInt() - 1;

            int at = 0;
            for(int j=0;j<n;j++) {
                if(arr[j] == move) {
                    at = j;
                }
            }

            // now from at I need to go to target either from lef to right;
            // via right;
            int to = at;
            int steps = 0;
            while(to!=target) {
                to = (to+1)%n;
                steps++;
                if(arr[to] !=0 && arr[to]!=move) {
                    steps = Integer.MAX_VALUE;
                    break;
                }
                if(to == target) {
                    break;
                }
            }
            to = at;
            int steps2 = 0;
            while(to!=target) {
                to = to - 1;
                if(to<0) to = n - 1;
                steps2++;
                if(arr[to] !=0 && arr[to]!=move) {
                    steps2 = Integer.MAX_VALUE;
                    break;
                }
                if(to == target) {
                    break;
                }
            }
            arr[at] = 0;
            arr[target] = move;


//            System.out.println(move+" "+Math.min(steps, steps2));

            ans += Math.min(steps, steps2);

//            System.out.println(move+" "+Math.min(steps, steps2));

        }

        System.out.println(ans);

    }
}
