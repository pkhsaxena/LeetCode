class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) {
                // System.out.println(nums[i] +" "+ map);
                // System.out.println(map.get(nums[i]));
                // System.out.println(i);
                return new int[]{map.get(nums[i]),i};
            } else{
                map.put(target-nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}