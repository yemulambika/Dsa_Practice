// Last updated: 6/29/2026, 1:36:40 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        double sum = 0;
4        for(int i = 0; i < k ; i++){
5            sum += nums[i];
6        }
7        double MaxAns = sum/k;
8        for(int i = k ; i < nums.length ; i++){
9            sum += nums[i] - nums[i-k];
10            MaxAns = Math.max(sum/k , MaxAns);
11        }
12        return MaxAns;
13    }
14}