class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int mergedArr[] =new int[nums1.length + nums2.length];

        System.arraycopy(nums1,0,mergedArr,0,nums1.length);

        System.arraycopy(nums2,0,mergedArr,nums1.length, nums2.length);

        Arrays.sort(mergedArr);

        int len = mergedArr.length;
        int mid = len/2;
        System.out.println(mid);
        if(len%2!=0){
            return mergedArr[mid];
        } else{
           return (mergedArr[mid] + mergedArr[mid-1])/2.0;      
        }
        
    }
}