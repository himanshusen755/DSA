/*Q5. Given an array of intervals where intervals[i] = [starti, endi], return the minimum number of intervals 
you need to remove to make the rest of the intervals non-overlapping. */
import java.util.Arrays;

public class Ass5 {
    public static void main(String[] args) {
        int[][] intervals = {{1,100},{11,22},{1,11},{2,12}};
        System.out.println(eraseIntervals(intervals));
    }

    private static int eraseIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int[] curr = new int[] {intervals[0][0], intervals[0][1]};
        int maxCap = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < curr[1]) continue; 
            curr[0] = intervals[i][0];
            curr[1] = intervals[i][1];
            maxCap++;
        }
        return intervals.length - maxCap;
    }
}
