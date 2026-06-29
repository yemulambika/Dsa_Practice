// Last updated: 6/29/2026, 12:26:26 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] str = s.trim().split("\\s++");
4        String ans = "";
5        for(int i = str.length-1 ; i >= 0 ; i--){
6            if(i == 0){
7                ans += str[i];
8            }else{
9                ans += str[i] + " ";
10            }
11        }
12        return ans;
13
14    }
15}