// Last updated: 6/29/2026, 3:42:09 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int start = 0 ; int end = nums.length -1;
4        while(start <= end){
5            int mid = start + (end - start)/2;
6            if(nums[mid] == target){
7                return mid;
8            }
9            if(nums[start] <= nums[mid]){
10                if(nums[start] <= target && target < nums[mid]){
11                    end = mid-1;
12                }else{
13                    start = mid+1;
14                }
15            }else{
16                if(nums[mid] < target && target <= nums[end]){
17                    start = mid +1;
18                }else{
19                    end = mid-1;
20                }
21            }
22        }
23        return -1;
24    }
25} 