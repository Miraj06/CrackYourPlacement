class Solution {
    public int removeDuplicates(int[] nums) {
        int a=0;
        for(int i=1;i<nums.length;i++){
            if(nums[a]!=nums[i]){
                nums[a+1]=nums[i];
                a++;
            }
        }
        return a+1;
    }
}
