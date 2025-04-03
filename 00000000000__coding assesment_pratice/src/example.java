import java.util.Scanner;

public class example {

    // Function to count the number of good strings of length n
    public static int countGoodStrings(int n)
    
    {
        // Array to store the number of good strings for each length
        int[] G = new int[n + 1];

       // Base case: For n = 1, we can have "p" or "q" as good strings
        if (n >= 1) 
        {
            G[1] = 2;  // "p" and "q"
        }

        // Calculate the number of good strings for lengths 2 to n
        for (int length = 2; length <= n; length++) {
            // Check for odd number of 'p' and no 'q' and odd number of 'q' and no 'p'
            if (length % 2 == 1)
            {
                G[length] ++;  // One good string with odd number of 'p'
                G[length] ++ ;  // One good string with odd number of 'q'
            }

            // Count the number of good strings formed by concatenating two smaller good strings
            for (int i = 1; i < length; i++) {
                G[length] += G[i] * G[length - i];
            }
        }

        // Return the number of good strings of length n
        return G[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Length of the string
        System.out.print("Enter the length of the string n: ");
        int n = scanner.nextInt();

        // Calculate and output the result
        int result = countGoodStrings(n);
        System.out.println("The number of good strings of length " + n + " is: " + result);

        scanner.close();
    }
}
