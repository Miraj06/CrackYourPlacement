class Solution {
    public int splitArray(int[] nums, int k) {
        int last = 0;
        int first=0;
        for(int i=0; i<nums.length;i++){
            first = Math.max(first,nums[i]);
            last += nums[i];
        }

        while(first < last){
            int a = first + (last - first) /2;
            int sum=0;
            int count=1;
            for(int n: nums){
                if(sum + n > a){
                    sum = n;
                    count++;
                }
                else{
                    sum += n;
                }
            }

            if(count > k){
                first = a + 1;
            }
            else{
                last = a;
            }
        }
        return first;
    }
   
}
