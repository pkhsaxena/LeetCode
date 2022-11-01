import java.util.Map.Entry;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] indices = new int[2];
        
        for(int i=0;i<nums.length;i++) {
            map.put(i,nums[i]);
        }
        System.out.println(map);
        for(int i=0;i<nums.length;i++) {
            int find = target - nums[i];
            if(map.containsValue(find)){
                int j = findVal(map,find);
                if(j != -1 && j!=i){
                    indices[0]=i;
                    indices[1]=j;
                    break;
                }
            }
        }
        Arrays.sort(indices);
        return indices;
    }
    int findVal(Map<Integer, Integer> map, int value) {
        for (Entry<Integer, Integer> o : map.entrySet()) {
            if (o.getValue().equals(value)) {
                return o.getKey();
            }
        }
        return -1;
    }

}