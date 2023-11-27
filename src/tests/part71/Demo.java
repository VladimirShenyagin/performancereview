package tests.part71;

public class Demo {
    public static boolean isStringsInterchangeable(String lhs, String rhs) {
        if (Math.abs(lhs.length() - rhs.length()) > 1) return false;
        if (lhs.length() > rhs.length()) {
            return checkDifferentLengthStrings(rhs, lhs);
        } else if (lhs.length() < rhs.length()) {
            return checkDifferentLengthStrings(lhs, rhs);
        }
        return checkSameLengthStrings(lhs, rhs);
    }

    private static boolean checkSameLengthStrings(String lhs, String rhs) {
        int counter = 0;
        for (int i = 0; i < lhs.length(); i++) {
            if (lhs.charAt(i) != rhs.charAt(i)) {
                counter += 1;
            }
            if (counter > 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkDifferentLengthStrings(String shorterStr, String longerStr) {
        if (longerStr.contains(shorterStr)) {
            return true;
        }
        int extra = 0;
        for (int i = 0; i < longerStr.length(); i++) {
            if (longerStr.charAt(i) != shorterStr.charAt(i - extra)) {
                if (extra > 0) {
                    return false;
                } else extra += 1;
            }
        }
        return true;
    }
}
