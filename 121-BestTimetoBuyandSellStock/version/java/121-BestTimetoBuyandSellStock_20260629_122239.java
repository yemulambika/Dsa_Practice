// Last updated: 6/29/2026, 12:22:39 PM
1class Solution {
2    public void reverseString(char[] s) {
3        int i = 0; int j = s.length-1;
4        while(i <= j){
5            char temp = s[i];
6            s[i] = s[j];
7            s[j] = temp;
8            i++;
9            j--;
10        }
11    }
12}