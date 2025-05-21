class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
             int gr=-1;
             int nxind=-1;

            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    nxind=j;
                    break;
                }
            }
            for(int k=nxind+1;k<nums2.length;k++)
            {
                if(nums2[k]>nums1[i])
                {
                    gr=nums2[k];
                    break;
                }
            }
            arr[i]=gr;
        }
        return arr;
     }
}
