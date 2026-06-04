// Last updated: 6/4/2026, 10:45:53 PM
/*
 * TC : O(n) 
 * SC : O(1)
*/

1class Solution {
2    public void moveZeroes(int[] nums) {
3        int k = 0;
4        for(int i = 0; i < nums.length ; i++){
5            if(nums[i] != 0){
6                int temp = nums[i];
7                nums[i] = nums[k];
8                nums[k] = temp;
9                k++;
10            }
11        }
12        
13    }
14}