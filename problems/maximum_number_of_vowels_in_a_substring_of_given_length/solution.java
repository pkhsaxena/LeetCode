class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> v = new HashSet<>();
		Arrays.asList('a','e','i','o','u').stream().forEach(v::add);
		int mx = 0;
		int count =0;
		for(int i=0;i<k;i++) {
			if (v.contains(s.charAt(i))) {
				count++;
			}
		}
		mx = Integer.max(mx, count);
        // System.out.println(mx);
		for(int i=k;i<s.length();i++) {
			char next = s.charAt(i);
			char prev = s.charAt(i-k);
			if(v.contains(next)) {
				count++;
			}
			if(v.contains(prev)) {
				count--;
			}
			mx = Integer.max(mx, count);
            // System.out.println("n="+next+" p="+prev+" mx="+mx);
		}
        return mx;
    }
}