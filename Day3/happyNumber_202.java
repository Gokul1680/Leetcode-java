/*  Write an algorithm to determine if a number n is happy.

  A happy number is a number defined by the following process:

 Starting with any positive integer, replace the number by the sum of the squares of its digits.
 Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
  Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.*/

 class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set =  new HashSet<>();
        return recur(n , set); 
    }
    public static boolean recur(int n , HashSet<Integer> set){
        int m = 0;
        int temp = 0;
        while(n>0){
            temp = n % 10;  
            n = n / 10;     
            m = m + (temp*temp);    
        }
        if (m == 1) return true;
        else if(!set.contains(m)){
            set.add(m);
            return recur(m , set);
        }
        else{
            return false;
        }
    }
}
