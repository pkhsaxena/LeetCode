class Solution {
    public String predictPartyVictory(String sen) {
        // String sen = "RDD";
		char[] senate = sen.toCharArray();
		int n = senate.length;
		Queue<Integer> r = new LinkedList<>();
		Queue<Integer> d = new LinkedList<>();
		for (int i = 0; i < senate.length; i++) {
			if (senate[i] == 'R')
				r.add(i);
			else
				d.add(i);
		}
		while (!r.isEmpty() && !d.isEmpty()) {
			int di = d.poll(), ri = r.poll();
			if (di < ri)
				d.add(n + di);
			else
				r.add(n + ri);
		}
        return r.size()>d.size()?"Radiant":"Dire";
    }
}