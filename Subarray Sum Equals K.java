class Solution {
    public int subarraySum(int[] nums, int k) {
        int subarr = 0;
        int sum = 0;
        int dif=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length;i++){
            sum += nums[i];
            dif = sum - k;
            if(map.containsKey(dif)){
                subarr +=map.get(dif);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return subarr;
    }
}
