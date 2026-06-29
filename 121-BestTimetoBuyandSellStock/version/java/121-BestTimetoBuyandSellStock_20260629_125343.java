// Last updated: 6/29/2026, 12:53:43 PM
1class Solution {
2    public int compress(char[] chars) {
3        int idx = 0; int n = chars.length ;
4        for(int i= 0 ; i < chars.length ; i++){
5            char ch = chars[i];
6            int count = 0;
7            while(i < n && chars[i] == ch){
8                count++ ; i++;
9            }
10            if(count == 1){
11                chars[idx++] = ch;
12            }else{
13                chars[idx++] = ch;
14                String str = Integer.toString(count);
15                for(char dig : str.toCharArray()){
16                    chars[idx++] = dig;
17                }
18            }
19            i--;
20        }
21        return idx;
22    }
23}