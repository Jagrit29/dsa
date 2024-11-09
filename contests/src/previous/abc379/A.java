package previous.abc379;


import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n%10;
        n = n/10;
        int b = n%10;
        n = n/10;
        int a = n%10;

        int n1 = b*100 + c*10 + a;
        int n2 = c*100 + a*10 + b;

        System.out.println(n1+" "+n2);



    }
}

