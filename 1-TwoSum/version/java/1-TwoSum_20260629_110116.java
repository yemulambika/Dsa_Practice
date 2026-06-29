// Last updated: 6/29/2026, 11:01:16 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer , Integer> Map = new HashMap<>();
4        int[] ans = new int[2];
5        Map.put(nums[0] , 0);
6        for(int i = 1; i < nums.length ; i++){
7            int complement = target - nums[i];
8            if(Map.containsKey(complement)){
9                ans[0] = Map.get(complement);
10                ans[1] = i;
11            }
12            Map.put(nums[i] , i);
13        }
14        return ans;
15    }
16}