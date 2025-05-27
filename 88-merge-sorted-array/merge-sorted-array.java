class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


System.out.println("m:"+m);
       System.arraycopy(nums2, 0, nums1, m, n);

       Arrays.sort(nums1);
  System.out.println("len:"+nums1.length);

    }
}