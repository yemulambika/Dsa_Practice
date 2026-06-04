// Last updated: 6/4/2026, 10:36:20 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        int[] ans = new int[2];
5        for(int i = 0; i < nums.length ; i++){
6            int complement = target - nums[i];
7            if(map.containsKey(complement)){
8                ans[0] = map.get(complement);
9                ans[1] = i;
10            }
11            map.put(nums[i] , i);
12        }
13        return ans;
14    }
15}