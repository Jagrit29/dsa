package previous.abc380;


import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i) == '|') {
                list.add(count);
                count = 0;
            } else {
                count++;
            }
        }

        for(int i: list) {
            System.out.print(i+" ");
        }
    }
}
