class Solution {
    public int[] sortedSquares(int[] nums) {
        int j = nums.length - 1;
        int[] result = new int[j+1];
        int i = 0;
        
        int k = j;
        while(i<=j){
            int numsi = nums[i]*nums[i];
            int numsj = nums[j] * nums[j];
        if(numsi > numsj){
            result[k] = numsi;
            i++;
            k--;
        }
            else{
                result[k] = numsj;
                j--;
                k--;
            }
        }
        return result;
    }
}
