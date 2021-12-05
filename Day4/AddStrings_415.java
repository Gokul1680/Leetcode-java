//Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

//You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.


class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuilder result = new StringBuilder();
        int sum = 0;
        while( i >= 0 || j >= 0){
            if(i>=0 && j >= 0){
                sum =sum + ( num1.charAt(i) - '0' + num2.charAt(j) - '0');
            }
            else if(i >= 0 ) sum =sum + (num1.charAt(i) - '0') ;
            
            else if(j>=0) sum =sum +(num2.charAt(j) - '0');
            result.append(sum%10);
            sum = sum / 10;

            i--;
            j--;

        }
        if(sum != 0) result.append(sum);
        
        
        return result.reverse().toString();
    }
}
