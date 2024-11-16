
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        char arr[] = s.toCharArray();

//        List<List<Integer>> blocks = new ArrayList<>();
        List<Integer> kBlock = new ArrayList<>();
        List<Integer> kfBlock = new ArrayList<>();

        int start = -1;
        int bc = 0;

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch=='1') {
                if(start == -1) {
                    start = i;
                }
            } else {
                if(start!=-1) {
                    // means the block ended;
                    bc++;
                    if(bc == k-1) {
                        kfBlock.add(start);
                        kfBlock.add(i-1);
                    } else if(bc == k) {
                        kBlock.add(start);
                        kBlock.add(i-1);
                    }
                    start = -1;
                }
            }
        }

        if(start!=-1) {
            bc++;
            if(bc == k) {
                kBlock.add(start);
                kBlock.add(s.length()-1);
            }
        }

        // now I have all the blocks;
        int end = kBlock.get(1);
        start = kfBlock.get(1) + 1;

        while(start<kBlock.get(0)) {
            arr[start] = '1';
            arr[end] = '0';
            end--;
            start++;
        }

        System.out.println(new String(arr));

    }
}
