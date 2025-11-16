import java.util.Arrays;


//sorting directly gives you lexicographic order.
public class SortStrings {
    public static void main(String[] args) {
        String[] words = {"bob", "ada", "racecar", "abc"};

        Arrays.sort(words); // sorts lexicographically

        System.out.println(Arrays.toString(words));
    }
}


public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello"));   // false
    }
}
