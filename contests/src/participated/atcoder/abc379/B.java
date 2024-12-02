package participated.atcoder.abc379;
import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = sc.next();

        int len = 0;
        int count = 0;
        for(int i=0;i<n;i++) {
            if(s.charAt(i) == 'X') {
                len = 0;
            } else {
                len++;
                if(len >= k) {
                    count++;
                    len = 0;
                }
            }
        }

        System.out.println(count);



    }
}

