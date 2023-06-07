class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
        	if('*' == s.charAt(i)) {
        		stack.pop();
        	}else {
				stack.push(s.charAt(i));
			}
        	// stack.stream().forEach(System.out::print);
        	// System.out.println();
        }
        StringBuilder sb = new StringBuilder();
        stack.stream().forEach(sb::append);
        return sb.toString();
    }
}