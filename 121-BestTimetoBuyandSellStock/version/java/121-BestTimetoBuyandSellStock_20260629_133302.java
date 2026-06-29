// Last updated: 6/29/2026, 1:33:02 PM
1class Solution {
2    public boolean isHappy(int n) {
3        int slow = n ; int fast = n ;
4        do{
5           slow = sqrt(slow);
6           fast = sqrt(sqrt(fast)); 
7        }while(slow != fast);
8        return slow == 1;
9    }
10    public int sqrt(int n ){
11        int sum = 0;
12        while( n > 0){
13            int dig = n%10;
14            sum += dig*dig;
15            n /=10;
16        }
17        return sum;
18    }
19}