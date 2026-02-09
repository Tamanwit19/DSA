import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 9};
        int target = 7;

        int first = findBound(nums, target, true);
        int last = findBound(nums, target, false);

        System.out.println(Arrays.toString(new int[]{first, last}));
    }

    private static int findBound(int[] nums, int target, boolean isFirst) {
        int l = 0, r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                ans = mid; 
                if (isFirst) {
                    r = mid - 1; 
                } else {
                    l = mid + 1;
                }
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}