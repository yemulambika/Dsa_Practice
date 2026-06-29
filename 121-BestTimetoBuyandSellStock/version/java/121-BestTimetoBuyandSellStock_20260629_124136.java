// Last updated: 6/29/2026, 12:41:36 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        HashMap<Character, Integer> set = new HashMap<>();
4        for(char ch : s.toCharArray()){
5            set.put(ch , set.getOrDefault(ch , 0)+1);
6        }
7        for(int i = 0; i < s.length() ; i++){
8            if(set.containsKey(s.charAt(i)) && set.get(s.charAt(i)) == 1){
9                return i;
10            }
11        }
12        return -1;
13    }
14}