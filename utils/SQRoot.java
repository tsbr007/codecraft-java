package utils;

public class SQRoot {

    private static int getSQRoot(int num) {
        int start = 0;
        int end = num;
        int mid = num / 2;

        while (mid != start) {
            if (mid * mid == num) {
                return mid;
            } else if (mid * mid > num) {
                end = mid;
            } else {
                start = mid;
            }
            mid = (end + start) / 2;
        }

        return num;

    }

    public static void main(String[] args) {
        System.out.println(getSQRoot(256));
        System.out.println(getSQRoot(255));

    }
}
