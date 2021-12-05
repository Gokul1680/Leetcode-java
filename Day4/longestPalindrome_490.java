//Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
//Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        char[] chars = s.toCharArray();
        int ans = 0;

        for(char c : chars){
            count[c]++;
        }
        for(int v : count){
            ans += v/2 * 2;
            if(ans % 2 == 0 && v % 2 == 1)  ans++;
        }
        return ans;
    }
}
