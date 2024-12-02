package participated.atcoder.abc380;


import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = Integer.toString(n);
        int o = 0;
        int t = 0;
        int tr = 0;

        for(char ch: s.toCharArray()) {
            if(ch=='1') {
                o++;
            } else if(ch=='2') {
                t++;
            } else if(ch=='3') {
                tr++;
            }
        }

        if(o == 1 && t == 2 && tr == 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
