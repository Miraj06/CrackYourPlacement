class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        
        int nsum=0;
        int sum =0;

        for(int i=0;i<=n;i++){
            nsum+=i;
        }
        for(int a:nums){
            sum+=a;
        }
        int missing_number=nsum-sum;
        return missing_number;
    }
}
