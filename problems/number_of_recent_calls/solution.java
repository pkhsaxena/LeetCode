class RecentCounter {
    LinkedList<Integer> dq;
    public RecentCounter() {
        dq = new LinkedList<>();
    }
    
    public int ping(int t) {
        // int[] arr = {1,100,30001,3002};
		// for(int i:arr) {
		// 	dq.add(i);
		// }
        dq.add(t);
		while(dq.getFirst() < t-3000) {
			dq.removeFirst();
		}
        return dq.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */