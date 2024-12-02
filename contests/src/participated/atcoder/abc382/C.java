package participated.atcoder.abc382;


import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[][] = new int[m][2];
        int count = 0;

        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }

        for(int j=0;j<m;j++) {
            b[j][0] = sc.nextInt();
            b[j][1] = j;
        }

        Arrays.sort(b, new Comparator<>(){
            public int compare(int a[], int b[]) {
                return a[0] - b[0];
            };
        });

        int low = 0;
        int high = m - 1;

        int ans[] = new int[m];
        Arrays.fill(ans, -1);
//        System.out.println(Arrays.toString(ans));

        for(int i=0;i<n;i++) {
            int target = a[i];
            int place = binarySearch(b, low, high, target);
//            System.out.println(place);
            if(place == high + 1) {
                // no elements;
            } else {
                for(int j=place;j<=high;j++) {
                    ans[b[j][1]] = i + 1;
                }
            }

            high = place - 1;
            if(high < 0) break;
        }

        for(int i=0;i<m;i++) {
            System.out.println(ans[i]);
        }
    }

    public static int binarySearch(int b[][], int low, int high, int target) {
        int ans = high + 1;
        while(low <= high) {
            int mid = high - (high - low)/2;
            if(b[mid][0] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}

// 1 2 3 4
// 0 1 2 3
// 4 2 1
// 1 1 1
// 4 2 1
//

