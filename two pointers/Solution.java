public class Solution {
    public static void main(String[] args) {
        System.out.println(convertToTitle(56));
    }
    public static String convertToTitle(int A) {
        if (A == 0) return "";

        A--;
        char ch = (char) ('A' + (A % 26));

        return convertToTitle(A / 26) + ch;
    }
}
