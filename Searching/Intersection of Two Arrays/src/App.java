import java.util.Arrays;
import java.util.HashSet;

public class App {

    public static int binarySearch(int[] nums, int target, int low) {
        int high = nums.length - 1;
        int idx = -1;

        while (high >= low) {
            int mid = (high + low) / 2;

            if (target == nums[mid]) {
                idx = mid;
                high = mid - 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return idx;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int low = 0;
        HashSet<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            int idx = binarySearch(nums2, nums1[i], low);
            if (idx != -1) {
                resultSet.add(nums2[idx]);
                low = idx + 1;
            }
        }

        // Convert HashSet to array
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }
    public static void main(String[] args) throws Exception {
        int arr1[] = {1,2,2,1};
        int arr2[] = {2,2};
        System.out.println( intersection(arr1,arr2));
    }
}
