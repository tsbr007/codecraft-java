
public class CheckRotation {

    private static boolean areRotation(String s1, String s2) {
        String selfConcat = s1 + s1;
        if (selfConcat.contains(s2)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(areRotation("abcd", "cdab"));
        System.out.println(areRotation("abcd", "cbad"));
    }

}
