import java.util.ArrayList;

public class Practice {

    // public static void countDigits(int n) {
    // int m = n;
    // int count = 0;
    // while (m > 0) {
    // m = m / 10;
    // count++;
    // }
    // System.out.println(count);
    // }
    // public static void countDigits(int n) {
    // int m = n;
    // int count = (int) (Math.log10(n) + 1);
    // System.out.println(count);
    // }
    // public static void reverseNumber(int n) {
    // int m = n;
    // int num = 0;
    // while (m > 0) {
    // int rem = m % 10;
    // m = m / 10;
    // num = num * 10 + rem;
    // }
    // System.out.println(num);
    // }
    // public static void palindromNumber(int n) {
    // int m = n;
    // int num = 0;
    // while (m > 0) {
    // int rem = m % 10;
    // m = m / 10;
    // num = num * 10 + rem;
    // }
    // if (num == n)

    // {
    // System.out.println("the number is palindrom");
    // } else
    // System.out.println("the number is not palindrome");
    // }
    // public static int gcd(int n1, int n2) {
    // int a = n1;
    // int b = n2;
    // while (a > 0 && b > 0) {
    // if (a > b) {
    // a = a % b;
    // } else {
    // b = b % a;
    // }
    // }
    // if (a == 0) {
    // return b;
    // } else {
    // return a;
    // }
    // }
    // public static Boolean armstrongnumber(int n) {
    // int count = (int) (Math.log10(n) + 1);
    // int m = n;
    // int num = 0;
    // while (m > 0) {
    // int rem = m % 10;
    // m = m / 10;
    // num += Math.pow(rem, count);
    // }
    // return num == n ? true : false;
    // }

    // public static void divisor(int n) {
    // int sqrt = (int) Math.sqrt(n);
    // ArrayList<Integer> arr = new ArrayList<>();
    // for (int i = 1; i <= sqrt; i++) {
    // if (n % i == 0) {
    // arr.add(i);
    // }
    // if (i != n / i) {
    // arr.add(n / i);
    // }
    // }
    // System.out.println(arr);
    // }
    // public static void selectionSort(int[] arr) {

    // for (int i = 0; i < arr.length; i++) {
    // int mini = i;
    // for (int j = i; j < arr.length; j++) {
    // if (arr[j] < arr[mini])
    // mini = j;
    // }
    // int temp = arr[mini];
    // arr[mini] = arr[i];
    // arr[i] = temp;
    // }
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // }
    // public static void bubbleSort(int[] arr) {

    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = 0; j < arr.length - 1 - i; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j + 1];
    // arr[j + 1] = arr[j];
    // arr[j] = temp;
    // }
    // }
    // }
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // }
    // public static void insertionSort(int[] arr) {

    // for (int i = 0; i < arr.length; i++) {
    // int j = i;
    // int temp = arr[j];
    // while (j > 0 && arr[j - 1] > temp) {
    // arr[j] = arr[j - 1];
    // j--;
    // }
    // arr[j] = temp;
    // }
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // }
    public static void subArray(int[] arr) {
        int sum = 10;
        int start = 0;
        int end = 0;
        int preSum = 0;
        int len = 0;
        while (end < arr.length && start <= end) {
            preSum = preSum + arr[end];
            if (preSum == sum) {
                len = Math.max((end - start) + 1, len);
                preSum = preSum - arr[start];
                preSum = preSum - arr[end];
                start++;
            } else if (preSum < sum) {
                end++;
            } else if (preSum > sum) {
                preSum = preSum - arr[start];
                preSum = preSum - arr[end];
                start++;
            }
        }
    }

    public static int upperBound(int[] arr, int target, int length) {

        int low = 0;
        int high = length - 1;
        int ans = length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        // countDigits(12345);
        // reverseNumber(12345);
        // palindromNumber(12421);
        // int num = gcd(9, 12);
        // System.out.println(num);
        // Boolean num = armstrongnumber(123);
        // divisor(36);
        int arr[] = { 3, 5, 8, 9, 15, 19 };
        // selectionSort(arr);
        // bubbleSort(arr);
        // insertionSort(arr);
        // subArray(arr);
        int ans = upperBound(arr, 9, 6);
        System.out.println(ans);
    }

}
