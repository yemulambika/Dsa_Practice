// Last updated: 6/29/2026, 3:08:31 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int start = 1; int end = nums.length -2;
4        int n = nums.length;
5        if(n == 1)return 0;
6        if(nums[0] > nums[1])return 0;
7        if(nums[n-1] > nums[n-2])return n-1;
8        while(start <= end){
9            int mid = start + (end - start)/2;
10if(nums[mid] > nums[mid-1] &&  nums[mid] > nums[mid+1]){
11                return mid;
12            }else if(nums[mid] < nums[mid-1]){
13                end = mid-1;
14            }else{
15                start = mid+1;
16            }
17        }
18        return -1;
19    }
20}