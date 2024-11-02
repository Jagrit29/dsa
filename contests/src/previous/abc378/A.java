package previous.abc378;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balls[] = new int[4];
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<4;i++) {
            balls[i] = sc.nextInt();
            hs.add(balls[i]);
        }

        Arrays.sort(balls);

        if(balls[0] == balls[1] && balls[2] == balls[3]) {
            System.out.println(2);
        } else if(hs.size()<4) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}