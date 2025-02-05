class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] mergedArray= new int[m+n];

        System.arraycopy(nums1, 0, mergedArray, 0, m);  // Copy nums1 into mergedArray
        System.arraycopy(nums2, 0, mergedArray, m, n);  // Copy nums2 into mergedArray
        
         Arrays.sort(mergedArray); 

              // Copy the sorted merged array back into nums1
        System.arraycopy(mergedArray, 0, nums1, 0, m + n);       
    }
}