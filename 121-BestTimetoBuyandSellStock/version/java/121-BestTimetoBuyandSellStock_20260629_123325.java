// Last updated: 6/29/2026, 12:33:25 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        String firstWord = strs[0];
4        String ans = "";
5        for(int i = 0; i < firstWord.length() ; i++){
6            char ch = firstWord.charAt(i);
7            for(int j = 1 ; j < strs.length ; j++){
8                if(strs[j].length() <= i ||strs[j].charAt(i) != ch){
9                    return ans;
10                }
11                
12            }
13            ans+= ch;
14        }
15        return ans;
16    }
17}