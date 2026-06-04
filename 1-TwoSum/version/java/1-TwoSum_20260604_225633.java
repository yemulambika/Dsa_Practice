// Last updated: 6/4/2026, 10:56:33 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        String ans = "";
4        String firstWord = strs[0];
5        for(int i = 0; i < firstWord.length() ; i++){
6            char ch = firstWord.charAt(i);
7            for(int j = 1; j < strs.length ; j++){
8                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
9                    return ans;
10                }
11            }
12            ans += ch;
13        }
14        return ans;
15    }
16}