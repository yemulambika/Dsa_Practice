// Last updated: 6/29/2026, 12:16:01 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int cnt = 0; int element = 0;
4        for(int i = 0 ; i <nums.length ; i++){
5            if(cnt == 0){
6                element = nums[i];
7                cnt++;
8            }else if(nums[i] == element){
9                cnt++;
10            }else{
11                cnt--;
12            }
13        }
14        int n = nums.length ;
15         cnt = 0;
16         for(int i = 0; i < n ; i++){
17            if(nums[i] == element){
18                cnt++;
19            }
20         }
21         if(cnt >= n/2){
22            return element ;
23         }else{
24            return -1;
25         }
26    }
27}