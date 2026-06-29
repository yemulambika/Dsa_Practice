// Last updated: 6/29/2026, 12:35:41 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char[] s1 = s.toCharArray();
4        char[] s2 = t.toCharArray();
5        Arrays.sort(s1);
6        Arrays.sort(s2);
7        return Arrays.equals(s1 , s2)? true : false;
8    }
9}