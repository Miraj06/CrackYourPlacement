class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]= new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            int indx=-1;
            int j=nums2.length-1;
            while( j>=0 && nums2[j]!=nums1[i] ){
                
                    if(nums2[j]>nums1[i]){
                        indx=nums2[j];
                    
                }  
                j--;  
            }
            arr[i]=indx;
        }
        return arr;
    }
}
