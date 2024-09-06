import java.util.*;

public class CombinationSumLeetCode {
    public static List<List<Integer>> combination(int[] candidates , int target){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result , new ArrayList<Integer>() ,candidates ,  target , 0 );
        return result;
    }
    private static void backtrack(List<List<Integer>> result, ArrayList<Integer> temp, int[] candidates,
            int target, int start) {
                if (target<0) {
                    return;
                }
                else if (target==0) {
                    result.add(new ArrayList<>(temp));
                }
        for (int i = 0; i < candidates.length; i++) {
            temp.add(candidates[i]);
            backtrack(result, temp, candidates, target-candidates[i], i);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        System.out.println(combination(candidates, 6));
    }
}
