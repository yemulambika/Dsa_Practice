// Last updated: 6/29/2026, 1:20:59 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String , List<String>> map = new HashMap<>();
4        for(String word : strs){
5            char[] array = word.toCharArray();
6            Arrays.sort(array);
7            String sorted = new String(array);
8            map.computeIfAbsent(sorted , k -> new ArrayList<>()).add(word);
9        }
10        return new ArrayList<>(map.values());
11    }
12}