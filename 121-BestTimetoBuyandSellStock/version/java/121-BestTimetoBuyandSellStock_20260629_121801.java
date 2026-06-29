// Last updated: 6/29/2026, 12:18:01 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int smallest = 0;
4        Arrays.sort(nums);
5        for(int i = 0 ; i < nums.length ; i++){
6            if(nums[i] == smallest){
7                smallest++;
8            }
9        }
10        return smallest;
11    }
12}