import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JPMC {

    // public static int armStrong(int num) {
    // int temp = num;
    // int newNum = 0;
    // int cnt = (int) (Math.log10(num) + 1);
    // System.out.println(cnt);
    // while (temp > 0) {
    // int rem = temp % 10;
    // newNum += (int) Math.pow(cnt, rem);
    // int rev = temp / 10;
    // temp = rev;
    // }
    // return newNum;
    // }

    // public static void selectSort(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // int min = arr[i];
    // int index = 0;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[j] < min) {
    // index = j;
    // }
    // }

    // }

    // }

    // public static int maxElement(int[] arr) {
    // int max = Integer.MAX_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // max = Math.max(max, arr[i]);
    // }
    // }

    // public static long maxSubarraySum(int[] arr, int n) {
    // long maxi = Long.MIN_VALUE; // maximum sum
    // long sum = 0;
    // // int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    // // 0 1 2 3 4 5 6 7 8
    // int start = 0;
    // int ansStart = -1, ansEnd = -1;
    // for (int i = 0; i < n; i++) {

    // if (sum == 0)
    // start = i; // starting index

    // sum += arr[i];

    // if (sum > maxi) {
    // maxi = sum;

    // ansStart = start;
    // ansEnd = i;
    // }

    // // If sum < 0: discard the sum calculated
    // if (sum < 0) {
    // sum = 0;
    // }
    // }

    // // printing the subarray:
    // System.out.print("The subarray is: [");
    // for (int i = ansStart; i <= ansEnd; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.print("]n");

    // return maxi;
    // }

    public static void check(List<String> arr) {
        try {
            for (String st : arr) {
                System.out.println(st + " ");
                arr.add("five");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int len = 0;
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                // i =Math.max(map.get(s.charAt(j))+1, i);
                i = map.get(s.charAt(j)) + 1;
            }
            map.put(s.charAt(j), j);
            len = Math.max(j - i + 1, len);
            j++;
        }
        return len;
    }

    public static void main(String[] args) {

        // int num = 123;
        // int ans = armStrong(num);
        // System.out.println(ans);
        // selectSort(arr);
        // int arr[] = { 13, 46, 24, 52, 20, 9 };

        // int ans = maxElement(arr);
        // int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // int n = arr.length;
        // long maxSum = maxSubarraySum(arr, n);
        // System.out.println("The maximum subarray sum is: " + maxSum);

        // List<String> arr = Arrays.asList("one", "two", "three", "four");

        // check(arr);
        int ans = lengthOfLongestSubstring("abcabcbb");

    }
}