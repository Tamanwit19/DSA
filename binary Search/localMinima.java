public class localMinima {
    public static void main(String[] args) {
        int nums[] = {1, 0, 3, 5, 2, 7};
        int result = findLocalMinima(nums);
        System.out.println(result);
    }

    public static int findLocalMinima(int[] nums) {
        int n = nums.length;
        if (n == 0) return -1;
        if (n == 1) return nums[0];

        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            boolean isSmallerThanLeft = (mid == 0 || nums[mid] < nums[mid - 1]);
            boolean isSmallerThanRight = (mid == n - 1 || nums[mid] < nums[mid + 1]);

            if (isSmallerThanLeft && isSmallerThanRight) {
                return nums[mid];
            }
            if (mid > 0 && nums[mid - 1] < nums[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}