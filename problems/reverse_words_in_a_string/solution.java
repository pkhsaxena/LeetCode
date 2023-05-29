class Solution {
    public String reverseWords(String s) {
        String n=s.trim();
        String[] words = n.split(" ");
		StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--) {
            if(!words[i].trim().isEmpty()) 
        	    sb.append(words[i] + " ");
        }
        return sb.toString().trim();
    }
}