class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
        int l1=nums1.length;
        int l2=nums2.length;
        int l=l1+l2;
        int[] nums=new int[l];

       for(int i=0; i<l1; i++){
            nums[i]=nums1[i];  
       }
        for(int i=0; i<l2; i++){
            nums[i+l1]=nums2[i];  
       }

       Arrays.sort(nums);

       double median=0;

       if (l%2 != 0)        median=nums[l/2];
       
       else         median=(nums[l/2] + nums[l/2 -1])/2.0;
       
return median;
    }
}