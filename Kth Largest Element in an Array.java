class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-k){
                a = nums[i];
            }
        }
        return a;
    }
}
