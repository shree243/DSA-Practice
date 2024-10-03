import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Stack;

class arrays {

    public static void reverseArray(int[] arr) {

        // ReverseArray- approach 1 using extra space
        int reverseHelper[] = new int[5];
        for (int i = 0; i <= arr.length - 1; i++) {
            reverseHelper[arr.length - 1 - i] = arr[i];
        }

        for (int i = 0; i < reverseHelper.length; i++) {
            arr[i] = reverseHelper[i];
        }
        System.out.println(Arrays.toString(arr));

        // ReverseArray- approach 2 without using extra space
        for (int j = 0; j < arr.length / 2; j++) {

            int temp = arr[j];
            arr[j] = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    // using extra space (o(n+1))
    public static void insertionAttheCustomPosition(int arr[], int element, int at) {
        int newArray[] = new int[arr.length + 1];
        for (int i = 0; i < at - 1; i++) {
            newArray[i] = arr[i];
        }
        newArray[at - 1] = element;
        for (int i = at - 1; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }
        System.out.println(Arrays.toString(newArray));
    }

    // ask space complexity
    // public static int searchElement(int arr[], int element) {
    // int position = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == element) {
    // position = i;
    // System.out.println(position);
    // break;
    // }
    // }
    // return position;
    // }
    public static void deleteElement(int arr[], int deleteElement) {
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == deleteElement) {
                position = i;
                continue;
            }
            if (position != 0) {
                arr[position] = arr[i];
                position++;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        int n = arr.length;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }

    public static void findMax(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            Math.max(max, arr[i]);
        }
    }

    // public static int pivotIndex(int[] nums) {
    // int ans = -1;
    // int left = 0;
    // int right = nums.length - 1;
    // int Ls = nums[left];
    // int Rs = nums[right];
    // while (left < right) {

    // if (Ls > Rs && --right != left) {
    // Rs = Rs + nums[right];
    // } else if (Rs > Ls && ++left != right) {
    // Ls = Ls + nums[left];
    // } else {
    // if (left < right) {
    // if (++left != right)
    // ans = left;
    // break;
    // }
    // }
    // }
    // if (left == 0 && Rs == 0) {
    // ans = 0;
    // }
    // return ans;
    // }

    // public static int pivotIndex(int[] nums) {
    // int totalSum = 0;
    // int leftSum = 0;
    // int ans = -1;
    // for (int i : nums) {
    // totalSum += i;
    // }
    // for (int i = 0; i < nums.length; i++) {
    // if (leftSum == (totalSum - leftSum - nums[i])) {
    // ans = i;
    // break;
    // } else {
    // ans = 0;
    // }
    // leftSum += nums[i];
    // }
    // return ans;
    // }

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i; j < arr.length; j++) {
    // if (arr[j] >= arr[i]) {
    // max = Math.max(max, arr[j]);
    // }
    // }
    // list.add(max);
    // max = 0;
    // }
    // 17,9,9,9,9,9,3,3,3
    // 1,1,1,1,1,1,1,1
    // 17
    // int arr[] = { 17, 4, 5, 3, 8, 9, 2, 1, 3 };
    public static ArrayList<Integer> leaderInArray(int[] arr) {
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    leader = false;
                    break;
                }
            }
            if (leader)
                list.add(arr[i]);
        }
        return list;
    }

    // int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
    public static int maxDifference(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                max = Math.max(max, arr[j] - arr[i]);
            }
        }
        return max;
    }

    // int arr[] = { 1, 3, 5, 6 };
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int ans = 0;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] < target) {
                if (mid + 1 == nums.length) {
                    ans = mid + 1;
                    break;
                } else if (nums[mid + 1] >= target) {
                    ans = mid + 1;
                    break;
                } else if (nums[mid + 1] < target)
                    i = mid + 1;
            } else if (nums[mid] > target) {
                j = mid - 1;
            }
        }
        return ans;
    }

    // public static int[] plusOne(int[] digits) {
    // int pointer = -1;
    // ArrayList<Integer> list = new ArrayList<>();
    // for (int i = 0; i < digits.length; i++) {
    // if (i == digits.length - 1) {
    // int ans = digits[i] + 1;
    // if (ans / 10 == 0) {
    // list.add(ans);
    // } else {
    // list.add(ans / 10);
    // list.add(ans % 10);
    // }
    // } else {
    // list.add(digits[i]);
    // }
    // }
    // int arr[] = new int[list.size()];
    // for (Integer i : list) {
    // arr[++pointer] = i;
    // }
    // return arr;
    // }

    public static int[] plusOne(int[] digits) {
        int pointer = -1;
        int div = 0;
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                ans = digits[i] + 1;
                if (ans / 10 == 0) {
                    list.add(ans);
                    System.out.println(ans);
                } else {
                    int dd = ans % 10;
                    list.add(dd);
                    System.out.println(dd);
                    div = ans / 10;
                }
            } else {
                int num = digits[i] + div;
                div = 0;
                if (num / 10 == 0) {
                    list.add(num);
                    System.out.println(num);
                } else {
                    int nn = num % 10;
                    list.add(nn);
                    System.out.println(nn);
                    div = num / 10;
                }
            }
        }
        // list.add(div);
        Collections.reverse(list);
        int arr[] = new int[list.size()];
        for (Integer i : list) {
            arr[++pointer] = i;
        }
        return arr;
    }

    // public static void merge(int[] nums1, int m, int[] nums2, int n) {
    // int r1 = m - 1;
    // int r2 = n - 1;
    // int w = m + n - 1;

    // while (r1 >= 0 && r2 >= 0) {
    // if (nums1[r1] > nums2[r2]) {
    // nums1[w] = nums1[r1];
    // r1--;
    // w--;
    // } else {
    // nums1[w] = nums2[r2];
    // r2--;
    // w--;
    // }
    // }
    // while (r1 >= 0) {
    // nums1[w] = nums1[r1];
    // r1--;
    // w--;
    // }
    // while (r2 >= 0) {
    // nums1[w] = nums1[r2];
    // r2--;
    // w--;
    // }
    // System.out.println(Arrays.toString(nums1));
    // }

    // public static int singleNumber(int[] nums) {
    // int num = 0;
    // Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    // for (int i = 0; i < nums.length; i++) {
    // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    // }

    // for (Map.Entry<Integer, Integer> it : map.entrySet()) {
    // num = it.getValue() == 1 ? it.getKey() : 0;
    // }
    // return num;

    // }

    // public static boolean binarySearch(int arr[], int target) {
    // int left = 0;
    // int right = arr.length - 1;
    // while (left <= right) {
    // int mid = left + right;
    // if (arr[mid] == target) {
    // return true;
    // } else if (arr[mid] > target) {
    // right = mid - 1;
    // } else {
    // left = mid + 1;
    // }
    // }
    // return false;
    // }

    public static Optional<Integer> findlastOccuranceBinarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                if (mid != arr.length - 1 && arr[mid + 1] == target)
                    left = mid + 1;
                else {
                    return Optional.of(mid);
                }
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return Optional.empty();
    }

    // public static Optional<Integer> findFirstOccuranceBinarySearch(int arr[], int
    // target) {
    // int left = 0;
    // int right = arr.length - 1;
    // while (left <= right) {
    // int mid = left + right;
    // if (arr[mid] == target) {
    // // if (mid == 0 || arr[mid - 1] != arr[mid]) {
    // // return Optional.of(mid);
    // // }
    // if (mid != 0 && arr[mid - 1] == target)
    // left = mid - 1;
    // else {
    // return Optional.of(mid);
    // }
    // } else if (arr[mid] > target) {
    // right = mid - 1;
    // } else {
    // left = mid + 1;
    // }
    // }
    // return Optional.empty();
    // }
    // int arr[] = { 1, 1, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5 };
    public static int firstOccurance(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                if (mid != 0 && arr[mid - 1] == target) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int lastOccurance(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                if (mid != arr.length - 1 && arr[mid + 1] == target) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;

    }

    public static int frequencyOfElement(int arr[], int target) {

        int first = firstOccurance(arr, target);
        int last = lastOccurance(arr, target);
        int res = last - first + 1;
        return res;
    }

    public static boolean check(int[] nums) {
        boolean res = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                continue;
            } else {
                rotateArray(i, nums);
                boolean ans = isSorted(nums);
                if (!ans) {
                    res = false;
                }
            }
        }
        return res;
    }

    public static void rotateArray(int end, int[] nums) {
        int start = 0;
        int endPoint = end;
        while (start <= endPoint) {
            int temp = nums[start];
            nums[start] = nums[endPoint];
            nums[endPoint] = temp;
            start++;
            endPoint--;
        }
        start = end + 1;
        int endPointer = nums.length - 1;
        while (start <= endPointer) {
            int temp = nums[start];
            nums[start] = nums[endPointer];
            nums[endPointer] = temp;
            start++;
            endPointer--;
        }
        int startPoint = 0;
        int ends = nums.length - 1;
        while (startPoint <= ends) {
            int temp = nums[startPoint];
            nums[startPoint] = nums[ends];
            nums[ends] = temp;
            startPoint++;
            ends--;
        }
    }

    public static boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i + 1;
        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i;
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int i = 0; i > prices.length; i++) {
            profit = Math.max(prices[i] - min, profit);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }

    // int nums[] = { 3, 4, 4, 7, 8, 10 }; 5

    public static int[] floorValue(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;
        int index = 0;
        int value = 0;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] < target) {
                index = mid;
                value = nums[mid];
                i = mid + 1;
            } else if (nums[mid] > target) {
                j = mid - 1;
            }
        }
        return new int[] { index, value };
    }

    // int nums[] = { 0, 1, 3, 4, 4, 7, 8, 10 }; 5

    public static int[] ceilValue(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;
        int index = 0;
        int value = 0;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] > target) {
                index = mid;
                value = nums[mid];
                j = mid - 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            }
        }
        return new int[] { index, value };
    }

    // public static int search(int[] nums, int target) {

    // int start = ;
    // int end = nums[nums.length - 1];

    // while (start <= end) {
    // int mid = (start + end) / 2;
    // if (nums[mid] == target)
    // return mid;
    // else if (nums[mid] > target) {
    // end = mid - 1;
    // } else {
    // start = mid + 1;
    // }
    // }
    // return -1;
    // }

    // public static int findMin(int[] nums) {
    // int i = 0;
    // int j = nums.length - 1;
    // int min = Integer.MAX_VALUE;
    // while (i <= j) {
    // int mid = (i + j) / 2;
    // int temp = mid;
    // if (nums[i] <= nums[mid] && nums[mid] > nums[j]) {
    // i = mid + 1;
    // } else if (nums[mid] < nums[i] && nums[mid] < nums[j] && --temp != i) {
    // j = mid - 1;
    // } else if (nums[mid] < nums[i] && nums[mid] < nums[j]) {
    // min = nums[mid];
    // break;
    // } else if (nums[mid] < min) {
    // min = Math.min(min, nums[mid]);
    // j = mid - 1;
    // }
    // }
    // return min;
    // }

    // int arr[] = { 2,1 };
    public static int findMin(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[i] <= nums[mid]) {
                min = Math.min(nums[i], min);
                i = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                j = mid - 1;
            }
        }
        return min;
    }

    // int arr[] = { 44, 22, 33, 11, 1 };
    public static int smallestDivisor(int[] nums, int threshold) {

        int i = 1;
        int j = Arrays.stream(nums).max().getAsInt();
        ;
        int ans = Integer.MAX_VALUE;
        while (i <= j) {
            int mid = (i + j) / 2;
            int sum = 0;
            for (int k = 0; k < nums.length; k++) {
                sum += (nums[k] / mid) + 1;
            }
            if (sum <= threshold) {
                ans = Math.min(ans, mid);
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }

    // 1, 0, 0, 0, 1
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean flag = false;
        for (int i = 0; i < flowerbed.length; i++) {
            int prev = i;
            int next = i;
            prev = (prev - 1 == -1) ? 0 : --prev;
            next = (next + 1 == flowerbed.length) ? 0 : ++next;
            if (flowerbed[prev] == 0 && flowerbed[next] == 0 && flowerbed[i] != 1) {
                flowerbed[i] = 1;
                n--;
            }
            if (n == 0) {
                flag = true;
                return flag;
            }
        }
        return flag;
    }

    // int arr[] = {94,95,37,30,67,7,5,44,26,55,42,28,97,19,100,74,13,88,18};
    // int cow = 7;
    public static int isPossible(int arr[], int prev, int mid) {
        int count = 1;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] - prev >= mid) {
                prev = arr[j];
                count++;
            }
        }
        return count;
    }

    public static int isCowPlace(int[] arr, int cows) {
        Arrays.sort(arr);
        int prev = 0;
        int max = 0;
        int low = 1;
        int high = arr[arr.length - 1];
        while (low <= high) {
            prev = arr[0];
            int mid = (low + high) / 2;
            int count = isPossible(arr, prev, mid);
            if (count == cows) {
                max = mid;
                low = mid + 1;
            } else if (count > cows) {
                max = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return max;
    }

    // String s = "l e e t c o d e";
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        String str = "AEIOUaeiou";
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (str.contains(Character.toString(arr[i])) && str.contains(Character.toString(arr[j]))) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (!str.contains(Character.toString(arr[i])) && str.contains(Character.toString(arr[j]))) {
                i++;
            } else if (str.contains(Character.toString(arr[i])) && !str.contains(Character.toString(arr[j]))) {
                j++;
            } else {
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    // int arr[] = { 1, 7, 3, 6, 5, 6 };
    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == (totalSum - nums[i] - leftSum)) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    // int arr[] = { 30,11,23,4,20 };
    public static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        int i = 1;
        int j = max;
        int ans = 0;
        while (i <= j) {
            int mid = (i + j) / 2;
            int bananasPerHour = canEat(piles, mid);
            if (bananasPerHour == h) {
                ans = mid;
                i = mid + 1;
            } else if (bananasPerHour < h) {
                ans = mid;
                j = mid - 1;
            } else if (bananasPerHour > h) {
                i = mid + 1;
            }
        }
        return ans;
    }

    public static int canEat(int arr[], int mid) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Math.ceil(arr[i] / mid);
        }
        return total;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            max = Math.max(max, weights[i]);
        }
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        int i = max;
        int j = sum;
        int ans = 0;
        while (i <= j) {
            int mid = (i + j) / 2;
            int daysCal = daysCalculate(weights, mid);
            if (daysCal <= days) {
                ans = daysCal;
                j = mid - 1;
            } else if (daysCal > days) {
                i = mid + 1;
            }
        }
        return ans;
    }

    public static int daysCalculate(int[] arr, int mid) {
        int count = 0;
        int days = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
            if (count <= mid)
                continue;
            else {
                count = count - arr[i];
                count = 0;
                days++;
            }
        }
        return days + 1;
    }

    // String s = "leet**cod*e";
    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                count++;
            } else if (count != 0) {
                count--;
            }

            else {
                st.add(s.charAt(i));
                System.out.println(s.charAt(i));
            }
        }
        String res = "";
        for (char ch : st) {
            res += ch;
        }
        return res;
    }

    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        int key = 0;
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > max) {
                max = it.getValue();
                key = it.getKey();
            }
            max = Math.max(max, it.getValue());
        }
        int count = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == key && nums[j] == key) {
                break;
            } else if (nums[i] == key && nums[j] != key) {
                j--;
            } else if (nums[i] != key && nums[j] == key) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return j - i;
    }

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int length = distance.length;
        int forward = 0;
        int reverse = 0;
        for (int i = start; i != destination; i = (i + 1) % length) {
            forward += distance[i];
        }
        for (int i = destination; i != start; i = (i + 1) % length) {
            reverse += distance[i];
        }
        return Math.min(forward, reverse);
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int count = 0;
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            map.put(s.charAt(j), j);
            count = Math.max(count, (j - i + 1));
            j++;
        }
        return count;
    }

    // int g[] = { 5, 2, 1, 2, 5, 2, 1, 2, 5 };
    // public static int maximumUniqueSubarray(int[] nums) {
    // int left = 0;
    // Set<Integer> track = new HashSet<>();
    // int ans = 0;
    // int currSum = 0;
    // for (int right = 0; right < nums.length; right++) {
    // if (track.contains(nums[right])) {
    // while (nums[left] != nums[right]) {
    // track.remove(nums[left]);
    // currSum -= nums[left];
    // left++;
    // }
    // left++;
    // } else {
    // currSum += nums[right];
    // track.add(nums[right]);
    // }
    // ans = Math.max(currSum, ans);
    // }
    // return ans;
    // }
    // int nums[] = { 1 4 3 3 5 5};
    // public static int lenOfLongSubarr(int nums[], int N, int K) {

    // int i = 0;
    // int j = 0;
    // int sum = nums[j];
    // int len = 0;
    // while (j < nums.length) {
    // if (sum < K) {
    // j++;
    // if (j >= nums.length) {
    // return len;
    // } else {
    // sum += nums[j];
    // }
    // } else if (sum == K) {
    // len = Math.max(len, (j - i + 1));
    // j++;
    // if (j >= nums.length) {
    // return len;
    // } else {
    // sum += nums[j];
    // }
    // } else {
    // sum -= nums[i];
    // i++;
    // }
    // }
    // return len;
    // }
    // // int nums[] = { -1, 0, 1, 2, -1, -4 };
    // public static List<List<Integer>> triplet(int n, int[] arr) {
    // List<List<Integer>> ans = new ArrayList<>();
    // Arrays.sort(arr);

    // for (int i = 0; i < n; i++) {
    // // remove duplicates:
    // if (i != 0 && arr[i] == arr[i - 1])
    // continue;

    // // moving 2 pointers:
    // int j = i + 1;
    // int k = n - 1;
    // while (j < k) {
    // int sum = arr[i] + arr[j] + arr[k];
    // if (sum < 0) {
    // j++;
    // } else if (sum > 0) {
    // k--;
    // } else {
    // List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
    // ans.add(temp);
    // j++;
    // k--;
    // // skip the duplicates:
    // while (j < k && arr[j] == arr[j - 1])
    // j++;
    // while (j < k && arr[k] == arr[k + 1])
    // k--;
    // }
    // }
    // }

    // return ans;
    // }

    public static int[][] merge(int[][] intervals) {

        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] newIntervals = new int[2];
        newIntervals[0] = intervals[0][0];
        newIntervals[1] = intervals[0][1];
        list.add(newIntervals);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= newIntervals[newIntervals.length - 1]) {
                newIntervals[newIntervals.length - 1] = intervals[i][1];
            } else {
                newIntervals[0] = intervals[i][0];
                newIntervals[1] = intervals[i][1];
                list.add(newIntervals);
            }
        }
        return list.toArray(new int[list.size()][]);
    }

    // int g[] = { 36, 82, 88, 56, 21, 17, 73, 86 };
    public static int[] getFloorAndCeil(int x, int[] arr) {
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x) {
                max = Math.min(max, arr[i]);
                ans[1] = max;
            }
            if (arr[i] <= x) {
                ans[0] = arr[i];
            } else {
                max = Math.min(max, arr[i]);
                ans[1] = max;
            }
        }
        return ans;
    }

    public static int firstOccurances(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int first = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                first = mid;
                j = mid - 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return first;
    }

    public static int lastOccurances(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int last = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                last = mid;
                i = mid + 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return last;
    }

    public static int ff(int[] nums, int x) {
        int first = firstOccurances(nums, x);
        int last = lastOccurances(nums, x);
        if (first == -1 && last == -1)
            return 0;

        return last - first + 1;
    }

    // public static int search(int[] nums, int target) {
    // int index = -1;
    // int point = searchedRotatePoint(nums);
    // if (point != -1) {
    // if (target >= nums[0] && target <= nums[point]) {
    // int i = 0;
    // int j = point;
    // index = searchPosition(nums, target, i, j);
    // return index;
    // } else {
    // int i = point + 1;
    // int j = nums.length - 1;
    // index = searchPosition(nums, target, i, j);
    // return index;
    // }
    // } else {
    // index = searchPosition(nums, target, 0, nums.length - 1);
    // return index;
    // }
    // }

    public static int searchPosition(int[] nums, int target, int i, int point) {
        while (i <= point) {
            int mid = (i + point) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                point = mid - 1;
            }
        }
        return -1;
    }

    public static int searchedRotatePoint(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                continue;
            } else {
                return i;

            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                ans = mid;
                return ans;
            }
            if (target >= nums[i] && target <= nums[mid]) {
                j = mid + 1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxOnes = 0;
        int zeroCount = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            if (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxOnes = Math.max(maxOnes, right - left + 1);
            right++;
        }

        return maxOnes;
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        // no of subarrays with sum k
        // sum,freq
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, sum = 0;
        for (int i : nums) {
            sum += i;
            if (sum == goal)
                count++;
            int prefix = sum - goal;
            if (map.containsKey(prefix)) {
                count += map.get(prefix);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // String s = "abba";
        // int ans1 = lengthOfLongestSubstring(s);
        // System.out.println(ans1);
        // int g[] = { 5, 2, 1, 2, 5, 2, 1, 2, 5 };
        // int ans1 = maximumUniqueSubarray(g);
        // int an = lenOfLongSubarr(nums, 6, 16);
        // int g[] = { 36, 82, 88, 56, 21, 17, 73, 86 };
        // int[] ans1 = getFloorAndCeil(17, g);
        // System.out.println(ans1);
        // int g[] = { 1, 1, 2, 2, 2, 2, 3 };
        // int ans1 = ff(g, 4);
        // System.out.println(ans1);
        // int g[] = { 4, 5, 6, 7, 0, 1, 2 };
        // int ans1 = search(g, 0);
        // System.out.println(ans1);
        int g[] = { 1, 0, 1, 0, 1 };
        int ans1 = numSubarraysWithSum(g, 2);
        System.out.println(ans1);
        // int an = lenOfLongSubarr(nums, 6, 16);
        // int nums[] = { -1, 0, 1, 2, -1, -4 };
        // List<List<Integer>> ans = triplet(6, nums);
        // System.out.println(ans);
        // int nums[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        // int[][] ans = merge(nums);
        // System.out.println(ans);
        // int arr[] = { 1, 2, 3, 4, 5 };
        // reverseArray(arr);
        // int arr[] = { 8, 6, 4, 2, 9, 83, 1 };
        // insertionAttheBeginning(arr);
        // int arr[] = { 8, 6, 4, 2, 9, 83, 1 };
        // int newElement = 56;
        // int at = 3;
        // insertionAttheCustomPosition(arr, newElement, at);
        // int arr[] = { 8, 6, 4, 2, 9, 83, 1 };
        // int searchElement = 83;
        // int val = searchElement(arr, searchElement);
        // int arr[] = { 8, 6, 4, 2, 9, 83, 1 };
        // int deleteElement = 4;
        // deleteElement(arr, deleteElement);
        // int rotateEle = 3;
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // rotate(arr, rotateEle);

        // int ans = pivotIndex(arr);
        // System.out.println(ans);
        // int ans = minEatingSpeed(arr, 5);
        // System.out.println(ans);
        // int ans = shipWithinDays(arr, 5);
        // System.out.println(ans);
        // String s = "leet**cod*e";
        // String ans = removeStars(s);
        // System.out.println(ans);
        // int[] arr = { 1, 2, 3, 4 };
        // // int ans = findShortestSubArray(arr);
        // int ans = distanceBetweenBusStops(arr, 0, 3);
        // System.out.println(ans);
        // int arr[] = { 17, 4, 5, 3, 8, 9, 2, 1, 3 };

        // 3,9,17
        // List<Integer> ans = leaderInArray(arr);
        // System.out.print(ans + "ans");

        // int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
        // // max difference

        // int arr1[] = { 7, 9, 5, 6, 3, 2 };
        // // 2
        // int max = maxDifference(arr1);
        // System.out.println(max);
        // int arr[] = { 9 };
        // // int ans = searchInsert(arr, 2);
        // int[] ans = plusOne(arr);
        // System.out.println(Arrays.toString(ans));
        // int arr1[] = { 2, 1, 2 };
        // // int arr2[] = { 1 };

        // // merge(arr1, 1, arr2, 1);
        // int ss = singleNumber(arr1);
        // System.out.println(ss);

        // int arr[] = { 1, 1, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5 };
        // int target = 5;
        // Optional<Integer> res = findlastOccuranceBinarySearch(arr, target);
        // if (res.isPresent()) {
        // System.out.println(res.get());
        // } else
        // System.out.println("Element didn't get");

        // int arr[] = { 2, 1 };

        // // int target = 10;
        // int ans = findMin(arr);
        // System.out.println(ans);
        // int arr[] = { 44, 22, 33, 11, 1 };

        // // int target = 10;
        // int ans = smallestDivisor(arr, 5);
        // System.out.println(ans);
        // int arr[] = { 1, 0, 0, 0, 1 };

        // // int target = 10;
        // boolean ans = canPlaceFlowers(arr, 2);
        // System.out.println(ans);

        // int nums[] = { 5 };
        // boolean ans = check(nums);

        // int res = removeDuplicates(nums);

        // int profit = maxProfit(nums);
        // System.out.println(profit);

        // int ans = search(nums, 5);
        // int nums[] = { 0, 1, 3, 4, 4, 7, 8, 10 };
        // int[] ans = floorValue(nums, 5);
        // System.out.println(Arrays.toString(ans));
        // int nums[] = { 0, 1, 3, 4, 4, 7, 8, 10 };
        // int[] ans = ceilValue(nums, 5);
        // System.out.println(Arrays.toString(ans));
        // int nums[] = { 2, 1 };
        // int[] ans = ceilValue(nums, 5);
        // System.out.println(Arrays.toString(ans));

        // int arr[] = { 94, 95, 37, 30, 67, 7, 5, 44, 26, 55, 42, 28, 97, 19, 100, 74,
        // 13, 88, 18 };
        // int cow = 7;
        // int val = isCowPlace(arr, cow);
        // System.out.println(val);
        // String s = "leetcode";
        // String ss = reverseVowels(s);
    }
}
// 1. searched element in rotated srted array binary serch
