// Last updated: 6/29/2026, 2:20:37 PM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int start = 0; int end = n ; int ans = n ;
7        while(start <= end){
8            int mid = start + (end - start)/2;
9            if(isBadVersion(mid)){
10                ans = mid;
11                end =mid-1;
12            }else{
13                start = mid+1;
14            }
15        }
16        return ans;
17    }
18}