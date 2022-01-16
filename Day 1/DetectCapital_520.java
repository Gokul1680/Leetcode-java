class Solution {
    public boolean detectCapitalUse(String word) {
       
        int count = 0;
        char[] letters = word.toCharArray();
        for(char c : letters){
            if(('Z' - c) >= 0 ){
                count++;
            }
        }
        if(count == 0 || count == 1 && 'Z' - word.charAt(0) >= 0 || count == letters.length  ){
            return true;
        }
        else{
            return false;
        }
    }
}
