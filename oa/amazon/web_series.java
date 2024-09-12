/*
Q1. A list of web series will be given in terms of number like [ 1,3,2,4 ] and two series number will be given as - series1 and series2 which is best critic-rated and best audience-rated respectively.

Find the minimum watch score which is the number of contiguous period of days in which series1 and series2 have been watched.

Example 1 :

N = 6 Watch history - [ 1,3,2,1,4] Series1 - 1 Series2 - 2

Answer - 2 as in the watch history, index 2 to 3 in having both series.
*/

/* 
Q2
The inputs are a string, integer x and integer y.

string is made up of 0, 1 and !, each ! can be either 0 or 1

Every subsequence of 01 in the string can produce error x

Every subsequence of 10 in the string can produce error y

0<=len(string)<=50000, 0<=x<=50000, 0<=y<=50000

Return the minimum error count modulo 10^9.

Example:

string=01!!, x=2, y=3, there're 4 cases:

0100 => errorCount is 2 + 3*2 = 8

0101 => errorCount is 2*3+3 = 9

0110 => errorCount is 2*2+2*3=10

0111 => errorCount is 2*3=6

so the result is 6

Example 2:

string=!!!!, x=2, y=5

we can replace all ! to 0 or 1, so there will be no 01 or 10 in the string, the result is 0.

*/

public class Main {
    public static void main(String[] args) {
        // Q1
        System.out.println("case1"+" "+solve(new int[]{1,3,2,1,4}, 1, 2));
        System.out.println("case2"+" "+solve(new int[]{1,3,4,2,3,4,2,0,1}, 1, 2));
        
    }
    
    public static int solve(int series[], int s1, int s2) {
        int st = 0;
        int n = series.length;
        int c1 = 0;
        int c2 = 0;
        int minLen = Integer.MAX_VALUE;
        // sliding window variation where c1 and c2 should be 1 and that's a valid window;
        for(int i=0;i<n;i++) {
            if(series[i] == s1) {
                c1++;
            } else if(series[i] == s2) {
                c2++;
            }
            
            while(c1 > 0 && c2 > 0) {
                minLen = Math.min(minLen, i - st + 1);
                if(series[st] == s1) {
                    c1--;
                } else if(series[st] == s2) {
                    c2--;
                }
                st++;
            }
        }
        
        return minLen;
        
        
    }
}
