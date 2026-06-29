// Last updated: 6/29/2026, 12:56:05 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> unique = new HashSet<>();
4        for(int num : nums){
5            if(unique.contains(num)){
6                return true;
7            }
8            unique.add(num);
9        }
10        return false;
11    }
12}