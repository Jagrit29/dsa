package participated.atcoder.abc382;


import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        String s = sc.next();
        int count = 0;
        StringBuffer bf = new StringBuffer("");
        for(int i=n-1;i>=0;i--) {
            if(d > 0 && s.charAt(i) == '@') {
                bf.append('.');
                d--;
            } else {
                bf.append(s.charAt(i));
            }
        }

        System.out.println(bf.reverse().toString());
    }
}
