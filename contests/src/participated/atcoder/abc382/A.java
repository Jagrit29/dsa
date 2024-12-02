package participated.atcoder.abc382;


import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for(int i=0;i<n;i++) {
            if(s.charAt(i) == '.') {
                count++;
            }
        }

        System.out.println(count + d);
    }
}
