// Last updated: 5/20/2026, 4:58:18 PM
/*
 * 1. Build first window
 * 2. Move window:
 *    - add right
 *    - remove left
 * 3. update answer
*/

1class Solution {
2    public int maxVowels(String s, int k) {
3        int cnt = 0;
4        for(int i = 0 ; i < k ; i++){
5            if(isVowels(s.charAt(i))){
6                cnt++;
7            }
8        }
9        int Max = cnt ;
10        for(int i = k ; i < s.length() ; i++){
11             if(isVowels(s.charAt(i))){
12                cnt++;
13            }
14            if(isVowels(s.charAt(i-k))){
15                cnt--;
16            }
17            Max = Math.max(Max , cnt);
18        }
19        return Max;
20    }
21    public boolean isVowels(char ch){
22        if(ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u'){
23            return true;
24        }
25        return false;
26    }
27}