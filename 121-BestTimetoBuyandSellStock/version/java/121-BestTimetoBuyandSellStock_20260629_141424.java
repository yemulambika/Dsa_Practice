// Last updated: 6/29/2026, 2:14:24 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int start = 0 ; int end = nums.length -1;
4        int ans = nums.length;
5        while(start <= end){
6            int mid = start + (end - start)/2;
7            if(nums[mid] >= target){
8                ans = mid;
9                end = mid-1;
10            }else{
11                start = mid + 1;
12            }
13        }
14        return ans;
15    }
16}