// Last updated: 6/29/2026, 2:11:00 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int start = 0 ; int end = nums.length-1;
4        int ans = -1;
5        while(start <= end ){
6            int mid = start + (end- start)/2;
7            if(nums[mid] == target){
8                ans = mid;
9            }
10            if(nums[mid] <target){
11                start = mid+1;
12            }else{
13                end = mid-1;
14            }
15        }
16        return ans;
17    }
18}