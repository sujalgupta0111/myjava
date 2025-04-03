public class Problem21_two_pointer2 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 8, 9, 10, 11, 15, 16, 17, 19 };
		System.out.println("myself");
		System.out.println(formatRange(arr));
	}

	public static String formatRange(int[] arr) {
		if (arr.length == 0)
			return "";
		int i = 0;
		int j = 0;
		String ans = "";
		while (j < arr.length) {
			while (j + 1 < arr.length && arr[j + 1] - arr[j] == 1) {
				j++;
			}
			if (i == j) {
				ans += +arr[i];
			} else {
				ans += arr[i] + "-" + arr[j];
			}
			j++;
			i = j;
			ans += ",";
		}
		return ans.toString();
	}
}
