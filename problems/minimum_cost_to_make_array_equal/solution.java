class Solution {
    public long minCost(int[] nums, int[] cost) {
        int low = 1;
        int high = (int) 1e6;
        long ret = Long.MAX_VALUE;
        int i = 1;
        while (i<=50) {
            int mid1 = low + (high - low)/3;
            int mid2 = high - (high - low)/3;
            long costs1 = getCost(mid1, nums, cost);
            long costs2 = getCost(mid2, nums, cost);
            if (costs1 < costs2) {
                high = mid2 - 1;
                ret = Long.min(ret, costs1);
            } else if (costs1 > costs2){
                low = mid1 + 1;
                ret = Long.min(ret, costs2);
            } else {
                low = mid1 + 1;
                high = mid2 - 1;
                ret = Long.min(ret, costs1);
            }
            i++;
        }
        return ret;
    }

    private long getCost(int mid, int[] nums, int[] cost) {
        long costs = 0;
        for (int i = 0; i < nums.length; i++) {
            costs += Math.abs(nums[i] - mid) * (long) cost[i];
        }
        return costs;
    }
}