// Last updated: 6/29/2026, 11:59:05 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] pf = new int[n];
5        int[] sf = new int[n];
6        pf[0] = sf[n-1] = 1;
7        for(int i = 1; i < n ; i++){
8            pf[i] = nums[i-1] * pf[i-1];
9        }
10        for(int i = n-2 ; i >= 0 ; i--){
11            sf[i] = nums[i+1] * sf[i+1];
12        }
13        int[] ans = new int[n];
14        for(int i = 0; i <n ; i++){
15            ans[i] = pf[i]*sf[i];
16        }
17        return ans;
18    }
19}