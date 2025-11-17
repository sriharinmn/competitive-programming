import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();        // input string
        int K = sc.nextInt();        // max allowed weight

        // weight of characters: a=1, b=2, ..., z=26
        int[] weight = new int[26];
        for (int i = 0; i < 26; i++) {
            weight[i] = i + 1;
        }

        HashSet<Integer> set = new HashSet<>();

        // generate all substrings using two pointers
        for (int i = 0; i < s.length(); i++) {
            int sum = 0;

            for (int j = i; j < s.length(); j++) {
                sum += weight[s.charAt(j) - 'a']; // accumulate weight

                if (sum <= K) {
                    set.add(sum);  // store only unique weights
                } else {
                    break;  // no need to go further, weight only increases
                }
            }
        }

        System.out.println(set.size());
    }
}


