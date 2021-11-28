class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
        Map<Character, Character> matchingBraces = new HashMap<>();
        
        matchingBraces.put('(', ')');
        matchingBraces.put('[', ']');
        matchingBraces.put('{', '}');
        
        for(char currentChar : s.toCharArray()){
            if(matchingBraces.containsKey(currentChar)){
                stack.push(matchingBraces.get(currentChar)); 
            }else if(stack.isEmpty() || currentChar != stack.peek()){
                return false;
            }else{
                stack.pop();
            }
        }
        return stack.isEmpty();
        
    }
}