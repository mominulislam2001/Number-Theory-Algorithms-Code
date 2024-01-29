import java.util.ArrayList;
import java.util.List;
public class App {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void generateSubsets(int index, int[] nums, List<Integer> subAns, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(subAns));
            return;
        }

        // Include the current element
        subAns.add(nums[index]);
        generateSubsets(index + 1, nums, subAns, result);

        // Exclude the current element
        subAns.remove(subAns.size() - 1);
        generateSubsets(index + 1, nums, subAns, result);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
