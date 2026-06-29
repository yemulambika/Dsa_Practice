// Last updated: 6/29/2026, 5:54:46 PM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> ans = new ArrayList<>();
4        backTrack(ans , "" , 0 , 0 , n);
5        return ans;
6    }
7    public void backTrack(List<String> ans , String current , int open , int close , int n){
8        if(current.length() == 2*n){
9            ans.add(current);
10            return ;
11        }
12        if(open < n){
13            backTrack(ans , current + "(" , open+ 1, close , n);
14        }
15        if(close < open){
16            backTrack(ans , current + ")" , open , close+1 , n);
17        }
18    }
19}