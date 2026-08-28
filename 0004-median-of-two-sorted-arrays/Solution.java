class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n + m];

        // Merge nums1 and nums2 into arr
        for (int i = 0; i < n; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            arr[n + i] = nums2[i];
        }

        // Sort the merged array
        Arrays.sort(arr);

        // Find median
        int total = n + m;
        if (total % 2 == 1) {
            return arr[total / 2]; 
        } else {
            return (arr[total / 2 - 1] + arr[total / 2]) / 2.0; 
        }
    }
}
