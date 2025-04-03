import java.util.*;
public class BIn_no {

    static boolean check(String s1, String s2) {
        // Array to store the frequency of characters
        int[] count = new int[59];

        // Count frequency of characters in s1
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'A']++;
        }

        // Subtract frequency based on characters in s2
        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i) - 'A']--;
        }

        // Check if all counts are zero (both strings have the same characters)
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input strings
        String s1 = in.next();
        String s2 = in.next();

        // Check if the strings have the same length
        if (s1.length() == s2.length()) {
            // Check if the strings are anagrams
            if (check(s1, s2)) {
                // Print the length of the string in binary
                System.out.println(Integer.toBinaryString(s1.length()));
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }

        in.close();
    }
}
