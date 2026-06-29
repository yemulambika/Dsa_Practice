// Last updated: 6/29/2026, 1:26:39 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> unique = new HashSet<>();
4        HashSet<Integer> ans = new HashSet<>();
5        for(int num : nums1){
6            unique.add(num);
7        }
8        for(int num : nums2){
9            if(unique.contains(num)){
10                ans.add(num);
11            }
12        }
13        int[] res = new int[ans.size()];int i = 0;
14        for(int num : ans){
15            res[i] = num;
16            i++;
17        }
18        return res;
19    }
20}