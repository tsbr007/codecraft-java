package utils;

public class SQRoot {

    private static float getSQRoot(int num) {
        float start = 0;
        float end = num;
        float mid = num / 2.0f;

        while (mid != start) {
            if (mid * mid == num) {
                return mid;
            } else if (mid * mid > num) {
                end = mid;
            } else {
                start = mid;
            }
            mid = (end + start) / 2.0f;
        }

        return num;

    }

    public static void main(String[] args) {
        System.out.println(getSQRoot(256));
        System.out.println(getSQRoot(255));

    }
}
