import java.util.ArrayList;
import java.util.List;

public class App {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subans = new ArrayList<>();
        generateCombinationSum(candidates, subans, 0, target, result);
        System.out.println(result);
        return result;
    }

    private static void generateCombinationSum(int[] candidates, List<Integer> subans, int i, int target, List<List<Integer>> result) {
      if(i == candidates.length-1){
        if (target == 0) {
            result.add(new ArrayList<>(subans));
            return;
        }
      }
     

        
      if (target >= candidates[i]) {
            subans.add(candidates[i]);
            generateCombinationSum(candidates, subans, i, target - candidates[i], result);
            subans.remove(subans.size() - 1);
     }

        
        generateCombinationSum(candidates, subans, i+1, target, result);
    }
    public static void main(String[] args) throws Exception {
        int arr[]= {2,3,6,7};
        int target = 7;
        combinationSum(arr,target);
    }
}
