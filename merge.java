class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for (int i=m+n-1; i>=0;i--) {
            if (m<1 && n>=1) {
                nums1[i]=nums2[n-1];
                n--;
            }
            if (n<1) return;
            //System.out.println("i="+i+"; n="+n+"; m="+m);
            if (n>0 && m>0) {
                if (nums2[n-1]>=nums1[m-1]) {
                    nums1[i]=nums2[n-1];
                    n--;
                } else {
                    nums1[i]=nums1[m-1];
                    m--;
                }
            }
        }
    }
}
