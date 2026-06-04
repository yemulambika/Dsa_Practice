// Last updated: 6/4/2026, 10:41:14 PM
/*
 * TC : O(n)
 * SC : O(1)
*/

1class Solution {
2    public int maxSubArray(int[] nums) {
3        int currSum = nums[0] ; int maxSum = nums[0];
4        for(int i = 1 ; i < nums.length ; i++){
5            currSum = Math.max(currSum + nums[i] , nums[i]);
6            maxSum = Math.max(maxSum , currSum);
7        }
8        return maxSum;
9    }
10}