import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class MedianSortedSubarray {

    private static Long[] findMedians(int[] nums, int windowSize) {
        List<Long> medians = new ArrayList<>();

        for (int i = 2; i < nums.length; i++) {
            TreeSet<Integer> window = new TreeSet<>();
            long medianValue = 0L;

            window.add(nums[i - 2]);
            window.add(nums[i - 1]);
            window.add(nums[i]);

            ArrayList<Integer> sortedWindow = new ArrayList<>(window);

            if (windowSize % 2 == 0) {
                medianValue = ((long) sortedWindow.get(windowSize / 2) +
                               (long) sortedWindow.get((windowSize - 1) / 2)) / 2;
            } else {
                medianValue = (long) sortedWindow.get(windowSize / 2);
            }

            medians.add(medianValue);
        }

        return medians.toArray(new Long[0]);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int windowSize = 3;
        System.out.println(Arrays.toString(findMedians(nums, windowSize)));
    }
}
