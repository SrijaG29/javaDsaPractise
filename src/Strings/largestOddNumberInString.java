package Strings;

public class largestOddNumberInString {
    public static void main(String[] args) {
        String nums = "7542351161";
        if (nums == null || nums.isEmpty()) {
            System.out.println("-");
        }
        else{
            for (int i = nums.length() - 1; i >= 0; i--) {
                char currentChar = nums.charAt(i);
                int digit = currentChar - '0';
                if (digit % 2 != 0) {
                    System.out.println(nums.substring(0, i + 1));
                    break;
                }
            }
        }
        System.out.println("-");
    }
}
