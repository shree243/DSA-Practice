// public class riv1 {

// public static int countDigits(int num) {
// int count = 0;
// while (num > 0) {
// count++;
// num = num / 10;
// }
// return count;
// }

// public static void main(String[] args) {

// int res = countDigits(12345);
// System.out.println(res + " count");
// int resss = (int) Math.log10(12345) + 1;

// }
// }

// public class riv1 {

// public static int reverseNumber(int num) {

// int res = 0;
// int atm = num;
// int rem = 0;
// while (atm > 0) {
// rem = atm % 10;
// atm = atm / 10;
// res = res * 10 + rem;
// }
// return res;
// }

// public static void main(String[] args) {

// int num = reverseNumber(12345);
// System.out.println(num);
// }
// }

// public class riv1 {

// public static int GCD(int num1, int num2) {

// int a = num1;
// int b = num2;
// int gCD = 0;

// while (a > 0 && b > 0) {
// if (a > b) {
// a = a % b;
// } else {
// b = b % a;
// }
// }
// if (a == 0)
// return b;
// else
// return a;
// // for (int i = 1; i < Math.min(a, b); i++) {
// // if (a % i == 0 && b % i == 0) {
// // gCD = i;
// // }
// // }
// }

// public static void main(String[] args) {
// int res = GCD(15, 20);
// System.out.println(res);
// }
// }

// import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.Scanner;

// public class riv1 {

// public static int[] reverse(int[] arr) {
// int[] newarr = new int[arr.length];
// Collections.reverse(Arrays.asList(arr));
// return arr;
// }

// public static void main(String[] args) {

// int arr[] = { 1, 2, 3, 4, 5, 6 };
// reverse(arr);

// }
// }

// import java.util.Arrays;

// public class riv1 {

// public static int[] selectionSort(int arr[]) {

// for (int i = 0; i < arr.length; i++) {
// int j = i;
// while (arr[j - 1] > arr[j] && j > 0) {

// }
// }

// for (int i = 0; i < arr.length; i++) {
// int min = i;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[j] < arr[min])
// min = j;
// }
// int temp = arr[i];
// arr[i] = arr[min];
// arr[min] = temp;
// }
// return arr;
// }

// public static void main(String args[]) {
// int arr[] = { 7, 5, 9, 2, 8 };
// int[] arr1 = selectionSort(arr);
// System.out.println(arr1);

// }
// }

import java.util.Arrays;
import java.util.HashSet;

// public class riv1 {

// public static int maxElement(int[] arr) {

// int[] ar = arr;
// int max = arr[0];
// for (int i = 0; i < ar.length; i++) {
// if (arr[i] > max)
// max = arr[i];
// }
// return max;
// }

// public static void main(String[] args) {
// int arr[] = { 8, 10, 5, 7, 9 };
// // int res = maxElement(arr);
// Arrays.sort(arr);
// int max = arr[arr.length - 1];
// System.out.println(max);
// }
// }

// public class riv1 {
// public static int SecondLargest(int[] arr) {

// int largest = Integer.MIN_VALUE;
// int secondLargest = Integer.MIN_VALUE;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > largest) {
// secondLargest = largest;
// largest = arr[i];
// } else if (arr[i] != largest && arr[i] > secondLargest) {
// secondLargest = arr[i];
// }
// }
// return secondLargest;
// }

// public static void main(String[] args) {
// int[] arr = { 9, 8, 2, 4, 10, 1, 11, 12 };
// int res = SecondLargest(arr);
// System.out.println(res);
// }
// }

// public class riv1 {
// public static int[] removeDuplicates(int arr[]) {
// HashSet<Integer> set = new HashSet<>();
// for (int i = 0; i < arr.length; i++) {
// set.add(arr[i]);
// }

// int[] res = new int[set.size()];
// int counter = 0;
// for (int ele : set) {
// res[counter] = ele;
// counter++;
// }
// return res;
// }

// public static void main(String[] args) {

// int arr[] = { 1, 1, 2, 2, 2, 2, 3, 5 };
// int res[] = removeDuplicates(arr);
// System.out.println(Arrays.toString(res));
// }
// }

// public class riv1 {
//     public static void removeDuplicates(int[] arr) {
//         int i = 0;
//         int j = i + 1;
//         while (j < arr.length) {
//             if (arr[j] != arr[i]) {
//                 arr[i + 1] = arr[j];
//                 i++;
//                 j++;
//             } else {
//                 j++;
//             }

//         }
//     }

//     public static void main(String[] args) {

//         int arr[] = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 4 };
//         removeDuplicates(arr);
//         System.out.println("ss");
//     }
// }

// public class riv1 {
// public static void nonZeros(int arr[]) {
// int i = 0;
// int j = 1;
// while (j < arr.length) {
// if (arr[i] != 0 && arr[j] != 0) {
// i++;
// j++;

// } else if (arr[i] == 0 && arr[j] != 0) {
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// i++;
// j++;
// } else if (arr[j] == 0 && arr[i] != 0) {
// i++;
// j++;
// } else {
// j++;
// }
// }
// }

// public static boolean check(int[] nums) {

// int count = 0;
// for (int i = 0; i < nums.length; i++) {
// if (nums[i] > nums[(i + 1) % nums.length]) {
// count++;
// }
// }
// if (count > 1) {
// return false;
// }
// return true;
// }

// public static void main(String[] args) {

// int arr[] = { 3, 4, 5, 1, 2 };
// boolean ans = check(arr);
// // nonZeros(arr);
// // System.out.println(arr.toString());
// }
// }

// public class riv1 {
//     public static int stocks(int[] arr) {
//         int mini = Integer.MAX_VALUE;
//         int profit = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < mini)
//                 mini = arr[i];
//             int val = arr[i] - mini;
//             profit = Math.max(profit, val);
//         }
//         return profit;
//     }

//     public static void main(String[] args) {

//         int arr[] = { 7, 1, 5, 3, 6, 4 };
//         int val = stocks(arr);
//         System.out.println(val);
//     }
// }

public class riv1 {
    public static void lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = arr.length;

        while (left <= right) {

            int mid = (left + right) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 5, 8, 8, 10, 10, 11 };
        lowerBound(arr, 9);
    }
}