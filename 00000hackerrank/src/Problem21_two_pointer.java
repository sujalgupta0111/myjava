public class Problem21_two_pointer {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 8, 10 };
        System.out.println(formatRange(arr));
    }

    public static String formatRange(int[] arr) {
        if (arr.length == 0) return "";
        
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0; // Two pointers

        while (j < arr.length) {
            // Jab tak consecutive elements mil rahe hain, `j` badhao
            while (j + 1 < arr.length && arr[j + 1] - arr[j] == 1) {
                j++;
            }

            // Agar `i` aur `j` same hain, iska matlab sirf ek number hai
            if (i == j) {
                ans.append(arr[i]);
            } else {
                ans.append(arr[i]).append("-").append(arr[j]); // Range format
            }

            // Next element pe move karo
            j++;
            i = j;

            if (j < arr.length) {
                ans.append(",");
            }
        }

        return ans.toString();
    }
}
