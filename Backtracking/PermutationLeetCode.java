import java.util.ArrayList;
import java.util.List;

public class PermutationLeetCode {
    public static List<List<Integer>> permute(int[] nums){ //One list that can store many list is called list of list
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        backtrack(list, temp ,nums);
        return list;
    }
    private static void backtrack(List<List<Integer>> list, ArrayList<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) {
                continue;
            }
            temp.add(nums[i]);
            backtrack(list, temp, nums);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }
}
