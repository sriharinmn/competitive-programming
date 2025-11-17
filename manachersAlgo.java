// o(n^2) :-   

public class LongestPalindromicSubstring {

    // expand around left and right and return palindrome length
    static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);  // final valid palindrome
    }

    static String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            // odd length palindrome
            String odd = expand(s, i, i);

            // even length palindrome
            String even = expand(s, i, i + 1);

            // update longest
            if (odd.length() > longest.length()) longest = odd;
            if (even.length() > longest.length()) longest = even;
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // bab or aba
        System.out.println(longestPalindrome("cbbd"));  // bb
    }
}





///////////// o(n^3) :-
/// 
///public class LongestPalindromeBruteForce {

//     // check if string is palindrome
//     static boolean isPalindrome(String s) {
//         int left = 0, right = s.length() - 1;
//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) return false;
//             left++;
//             right--;
//         }
//         return true;
//     }

//     // brute force longest palindrome
//     static String longestPalindrome(String s) {
//         int n = s.length();
//         String longest = "";

//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 String sub = s.substring(i, j + 1);

//                 if (isPalindrome(sub) && sub.length() > longest.length()) {
//                     longest = sub;
//                 }
//             }
//         }
//         return longest;
//     }

//     public static void main(String[] args) {
//         String s = "babad";
//         System.out.println(longestPalindrome(s));  // "bab" or "aba"
//     }
// }
