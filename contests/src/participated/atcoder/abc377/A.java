package participated.atcoder.abc377;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.indexOf('A')!=-1 && s.indexOf('C')!=-1 && s.indexOf('B')!=-1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
