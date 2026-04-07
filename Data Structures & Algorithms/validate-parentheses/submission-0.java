class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for(char i : s.toCharArray()){
            if(map.containsKey(i)){
                if(stack.isEmpty() || stack.pop() != map.get(i)){
                    return false;
                }
            }
            else{
                stack.push(i);
            }
    }
        return stack.isEmpty();
}
}

