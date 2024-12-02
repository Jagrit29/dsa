package participated.atcoder.abc378;


import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        int b[] = new int[n];
        for(int i=0;i<n;i++) {
            b[i] = hm.getOrDefault(arr[i], -1);
            hm.put(arr[i], i + 1);
        }

        for(int i=0;i<n;i++) {
            System.out.print(b[i]+" ");;
        }
    }
}


