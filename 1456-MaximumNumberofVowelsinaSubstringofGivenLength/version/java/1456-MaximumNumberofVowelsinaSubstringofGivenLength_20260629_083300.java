// Last updated: 6/29/2026, 8:33:00 AM
1class Solution {
2    public int maxVowels(String s, int k) {
3        int ans = 0 ; String vowels = "aeiou";
4        for(int i = 0; i < k ; i++){
5            if(vowels.indexOf(s.charAt(i)) != -1){
6                ans++;
7            }
8        }
9        int result = ans;
10        for(int i = k ; i < s.length(); i++){
11            if(vowels.indexOf(s.charAt(i-k)) != -1){
12                ans--;
13            }
14            if(vowels.indexOf(s.charAt(i)) != -1){
15                ans++;
16            }
17            result = Math.max(ans , result);
18        }
19        return result;
20    }
21}