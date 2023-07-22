class Solution {
    public int maxProduct(int[] nums) {
        int sum=1;
        int largest=nums[0];
        for(int i=0; i<nums.length;i++){
            sum *= nums[i];
            largest=Math.max(largest, sum);
            if(sum==0){
                sum=1;
            }
        }
        sum=1;
        for(int i=nums.length-1;i>=0;i--){
            sum *=nums[i];
            largest =Math.max(largest, sum);
            if(sum==0){
                sum=1;
            }
        }
        return largest;
    }
}
