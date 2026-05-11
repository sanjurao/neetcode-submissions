class Solution {
    public boolean isValid(String s) {
        char [] inp = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        HashMap<Character,Character> closeToOpen =  new HashMap<>();
        closeToOpen.put(')','(');
        closeToOpen.put(']','[');
        closeToOpen.put('}','{');

        for(char ch : inp) {            
            //closing
            if(closeToOpen.containsKey(ch)) {
                if(!stack.isEmpty() && stack.peek() == closeToOpen.get(ch)) {
                    stack.pop();
                } else {
                    return false;
                }

            } else  {
                //opening
                stack.push(ch);
            }                     

        }
        return stack.isEmpty();
        
    }
}
