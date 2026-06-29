// Last updated: 6/29/2026, 1:42:18 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int Max = 0; int count = 0;
4        for(int num : nums){
5            if(num == 1){
6                count++;
7                Max = Math.max(Max , count);
8            }else{
9                count= 0;
10            }
11        }
12        return Max;
13    }
14}