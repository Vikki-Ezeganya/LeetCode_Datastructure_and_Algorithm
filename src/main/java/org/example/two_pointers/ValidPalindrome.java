package org.example.two_pointers;

public class ValidPalindrome {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String s) {

        //create a left pointer
        int left = 0;

        //Create right pointer
        int right = s.length() -1;

        while(left < right) {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
