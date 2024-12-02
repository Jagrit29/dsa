package participated.codeforces;


import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();

        for(int t=0;t<tt;t++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
            }
            int ans = 0;
            for(Map.Entry<Integer, Integer> kv: hm.entrySet()) {
                ans += kv.getValue()/2;
            }

            System.out.println(ans);
        }
    }
}
