// Last updated: 6/29/2026, 1:59:58 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0 ; int right = height.length-1;
4        int MaxArea = 0;
5        while(left < right){
6            int h = Math.min(height[left] , height[right]);
7            int width = right - left;
8            MaxArea = Math.max(MaxArea , h*width);
9            if(height[left] < height[right]){
10                left++;
11            }else{
12                right--;
13            }
14        }
15        return MaxArea;
16    }
17}