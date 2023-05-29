class Solution {
    public String reverseVowels(String s) {
        List<Character> v = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				v.add(s.charAt(i));
			}
		}
		Collections.reverse(v);
		StringBuffer sb = new StringBuffer();
		int vi =0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				sb.append(v.get(vi++));
			} else {
				sb.append(c);
			}
		}
        return sb.toString();
    }
}