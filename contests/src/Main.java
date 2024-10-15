import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        // need index of all characters;
        HashMap<Character, List<Integer>> hm = new HashMap<>();

        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            if(!hm.containsKey(ch)) hm.put(ch, new ArrayList<>());
            hm.get(ch).add(i);
        }
        long count = 0;

        for(char ch='A';ch<='Z';ch++) {
            if(hm.containsKey(ch)) {
                List<Integer> index = hm.get(ch);
                long sum = 0;

                for (int i = 1; i < index.size(); i++) {
                    sum += index.get(i - 1);
                    count += (long) i * index.get(i) - sum - (long) i * index.get(i - 1);
                }
            }
        }

        System.out.println(count);


        // thinking
//        // ABCACC
//        // 0123
//        // 5
//        // first index of the character after that;
//        // A - (2),
//        // All the index of this character are valid;
//        // get all the indexes of same character;
//
//
//        // Palindromes of length 5;
//        // i j k;
//
//        for(int i=0;i<n-2;i++) {
//            // for this particular i;
//            // the palindrome will automaitcally be there if this particular character is there later and there is some other thing in b/w;
//
//            for(int j=i+1;j<n-1;j++) {
//                for(int k=j+1;k<n;k++) {
//                    // this is n^3;
//                }
//            }
//        }



    }
}
