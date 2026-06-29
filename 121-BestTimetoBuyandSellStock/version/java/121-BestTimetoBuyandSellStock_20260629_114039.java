// Last updated: 6/29/2026, 11:40:39 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int k = 0;
4        for(int i = 1 ; i < nums.length ; i++){
5            if(nums[i] != nums[i-1]){
6                k++;
7            }
8            nums[k] = nums[i];
9        }
10        return k+1;
11    }
12}