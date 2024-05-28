class Maths {

    // public static int countDigits(int N) {

    // int counter = 0;
    // while (N > 0) {
    // int digit = N % 10;
    // if (digit != 0 && N % digit == 0) {
    // counter++;
    // }
    // N = N / 10;
    // }
    // return counter;
    // }
    // public static int reverseNumber(int N) {
    // int rev = 0;
    // int rem = 0;
    // while (N != 0) {
    // rem = N % 10;
    // rev = (rev * 10) + rem;
    // N = N / 10;
    // }
    // if (rev % 10 != rem) // exceed int range
    // {
    // return 0;
    // }
    // return rev;
    // }
    // public static boolean palindromNumber(int x) {
    // int rem = 0;
    // int rev = 0;
    // if (x < 0) {
    // return false;
    // }
    // while (x != 0) {
    // rem = x % 10;
    // rev = (rev * 10) + rem;
    // x = x / 10;
    // }
    // if (x == rev) {
    // return true;
    // } else
    // return false;
    // }

    // public static int findGCD(int a, int b) {
    // int gcd = 1;

    // for (int i = 1; i < Math.min(a, b); i++) {
    // if (a % i == 0 && b % i == 0) {
    // gcd = i;
    // }
    // }
    // return gcd;
    // }

    // public static int findGCD2(int a, int b) {
    // int gcd = 1;

    // for (int i = Math.min(a, b); i > 1; i--) {
    // if (a % i == 0 && b % i == 0) {
    // return i;
    // }
    // }
    // return gcd;
    // }

    // Euclidean Method

    // public static int findGCD2(int a, int b) {
    // int gcd = 1;
    // while (a > 0 && b > 0) {
    // if (a > b) {
    // a = a % b;
    // } else
    // b = b % a;
    // }
    // if (a == 0) {
    // return b;
    // }
    // return a;
    // }
    // public static Long[] findGCD2(Long A, Long B) {

    // // code here
    // Long x = A;
    // Long y = B;
    // Long Gcd = 1L;
    // while (A > 0 && B > 0) {
    // if (A > B) {
    // A = A % B;
    // } else
    // B = B % A;

    // }
    // if (A == 0) {
    // Gcd = B;
    // }
    // Long lcd = (x * y) / Gcd;
    // Long[] arr = new Long[2];
    // arr[0] = Gcd;
    // arr[1] = lcd;
    // return arr;

    // }

    public static int ArmStrongNumber(int n) {

        int sum = 0;
        int count = String.valueOf(n).length();

        while (n != 0) {
            int rem = n % 10;
            sum += Math.pow(rem, count);
            n = n / 10;
        }
        return sum;
    }

    static Long i = 1L;
    static Long sum = 0L;

    public static Long seriesNumber(Long n) {
        // code here
        if (i > n) {
            return sum;
        }
        sum += (long) Math.pow(i, 3);
        i++;
        seriesNumber(n);
        return sum;
    }

    public static void main(String[] args) {

        // 1
        // int N = 12;
        // int counter = countDigits(N);
        // System.out.println(counter);
        // int number = -356;
        // int rev = reverseNumber(number);
        // System.out.println(rev);

        // int number = 121;
        // Boolean rev = palindromNumber(number);
        // System.out.println(rev);
        // Long a = 10L;
        // Long b = 5L;
        // Long[] gcd = findGCD2(a, b);
        // System.out.println(gcd);
        // int armstringnumber = ArmStrongNumber(534);
        // System.out.println(armstringnumber);

        Long num = 5L;
        Long sum = seriesNumber(num);
    }
}

// class Recursion {

// static boolean palindrome(int i, String s){

// // Base Condition
// // If i exceeds half of the string, means all the elements
// // are compared, we return true.
// if(i>=s.length()/2) return true;

// // If start is not equal to end, not palindrome.
// if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

// // If both characters are same, increment i and check start+1 and end-1.
// return palindrome(i+1,s);

// }
// public static void main(String[] args) {

// // Example string.
// String s = "madam";
// System.out.println(palindrome(0,s));
// }
// }