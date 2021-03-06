// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
 

// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false
 

// Constraints:

// 1 <= s.length <= 104
// s consists of parentheses only '()[]{}'.

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
            Map<Character,Character> map = new HashMap<>();
            map.put('{','}');
            map.put('(',')');
            map.put('[',']');
            char[] arr = s.toCharArray();
            for(char c : arr){

                if(!stack.empty()) {
                    try {

                        if (map.get(stack.peek()) == c) {
                            stack.pop();
                            continue;
                        }
                    }
                    catch(NullPointerException e){
                        return false;

                }
                }
                stack.push(c);

            }
            if(stack.empty())return true;
            else return false;
    }
}
