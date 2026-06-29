// Last updated: 6/29/2026, 12:47:48 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int left = 0 ; int maxLen= 0;
4        HashSet<Character> set = new HashSet<>();
5        for(int right = 0 ; right < s.length() ; right++){
6            while(set.contains(s.charAt(right))){
7                set.remove(s.charAt(left));
8                left++;
9            }
10            maxLen = Math.max(maxLen , right - left + 1);
11            set.add(s.charAt(right));
12        }
13        return maxLen;
14    }
15}