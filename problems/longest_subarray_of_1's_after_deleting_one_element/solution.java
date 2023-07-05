class Solution {
    public static int longestSubarray(int[] nums) {
        boolean zero = false;
        int start = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;
        for(;end<nums.length;end++){
            if(nums[end]==0 && zero){

                while(nums[start]!=0){
                    start+=1;
                }
                start++;
            }
            else if(nums[end]==0){
                zero=true;
            }
            // System.out.println("start: "+start);
            // System.out.println("end: "+end);
            max = Math.max(max, end-start);
        }
        return max;
    }
}