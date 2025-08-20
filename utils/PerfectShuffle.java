package utils;

public class PerfectShuffle {

    public static boolean isPerfectShuffle(String s1, String s2, String s3) {
        if (s1.length() != s2.length() || s1.length() * 2 != s3.length()) {
            return false;

        }
        StringBuilder builtString = new StringBuilder();
        StringBuilder builtStringReverse = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            builtString.append(s1.charAt(i));
            builtString.append(s2.charAt(i));

            builtStringReverse.append(s2.charAt(i));
            builtStringReverse.append(s1.charAt(i));
        }

        return builtString.toString().equals(s3) || builtStringReverse.toString().equals(s3);
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "1234";
        System.out.println(isPerfectShuffle(s1, s2, "A1B2C3D4")); // true
        System.out.println(isPerfectShuffle(s1, s2, "1A2B3C4D")); // true
        System.out.println(isPerfectShuffle(s1, s2, "1AB2C3D4")); // false
    }
}
