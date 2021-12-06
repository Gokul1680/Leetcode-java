//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0 ;
        int j = nums.length-1;
        int k = j;
        int[] result = new int[nums.length];
        while(i<=j){
            if(Math.pow(nums[i],2) > (Math.pow(nums[j],2))){
                result[k] = nums[i]*nums[i];
                i++;
            }
            else{
                result[k] = nums[j]*nums[j];
                j--;
            }
            k--;
        }
      
        return result;
    }
}
