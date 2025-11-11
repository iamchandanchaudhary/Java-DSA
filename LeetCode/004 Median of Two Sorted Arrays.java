class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        int left = (totalLength + 1) / 2;
        int right = (totalLength + 2) / 2;
        return (findKth(nums1, 0, nums2, 0, left) + findKth(nums1, 0, nums2, 0, right)) / 2.0;
    }

    private int findKth(int[] nums1, int i, int[] nums2, int j, int k) {
        if (i >= nums1.length) return nums2[j + k - 1];
        if (j >= nums2.length) return nums1[i + k - 1];
        if (k == 1) return Math.min(nums1[i], nums2[j]);

        int midVal1 = (i + k / 2 - 1 < nums1.length) ? nums1[i + k / 2 - 1] : Integer.MAX_VALUE;
        int midVal2 = (j + k / 2 - 1 < nums2.length) ? nums2[j + k / 2 - 1] : Integer.MAX_VALUE;

        if (midVal1 < midVal2) {
            return findKth(nums1, i + k / 2, nums2, j, k - k / 2);
        } else {
            return findKth(nums1, i, nums2, j + k / 2, k - k / 2);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] nums1_1 = {1, 3};
        int[] nums2_1 = {2};
        System.out.println("Example 1 Output: " + solution.findMedianSortedArrays(nums1_1, nums2_1));

        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        System.out.println("Example 2 Output: " + solution.findMedianSortedArrays(nums1_2, nums2_2));

        int[] nums1_3 = {0, 0};
        int[] nums2_3 = {0, 0};
        System.out.println("Example 3 Output: " + solution.findMedianSortedArrays(nums1_3, nums2_3));

        int[] nums1_4 = {};
        int[] nums2_4 = {1};
        System.out.println("Example 4 Output: " + solution.findMedianSortedArrays(nums1_4, nums2_4));

        int[] nums1_5 = {2};
        int[] nums2_5 = {};
        System.out.println("Example 5 Output: " + solution.findMedianSortedArrays(nums1_5, nums2_5));
    }
}