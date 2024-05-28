class Pattern {

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern3() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5() {
        for (int i = 0; i < 5; i++) {
            int j = 5;
            for (j = j - i; j > 0; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // public static void pattern5() {
    // for (int i = 1; i < 6; i++) {
    // for (int j = 0; j < 5 - i + 1; j++) {
    // System.out.print(" * ");
    // }
    // System.out.println();
    // }
    // }

    public static void pattern6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    // public static void pattern8(int n) {

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < i; j++) {
    // System.out.print(" ");
    // }
    // for (int k = 0; k < n * 2 - 2 * i - 1; k++) {
    // System.out.print("*");
    // }
    // for (int j = 0; j < i; j++) {
    // System.out.print(" ");
    // }
    // System.out.println();
    // }
    // public static void pattern9(int n) {
    // for (int i = 0; i <= 2 * n - 1; i++) {
    // if (i >= n + 1) {
    // for (int j = 2 * n - i; j > 0; j--) {
    // System.out.print("*");
    // }
    // } else {
    // for (int j = 0; j <= i; j++) {
    // System.out.print("*");
    // }
    // }
    // System.out.println();
    // }

    // }
    // public static void pattern10(int n) {
    // for (int i = 1; i <= n; i++) {
    // int start = 0;
    // if (i % 2 == 0) {
    // start = 0;
    // } else
    // start = 1;
    // for (int j = 1; j <= i; j++) {
    // System.out.print(start);
    // start = 1 - start;
    // }
    // System.out.println();
    // }
    // }
    // public static void pattern11(int n) {
    // int space = 6;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j);
    // }
    // for (int j = space; j >= 1; j--) {
    // System.out.print(" ");
    // }
    // for (int j = i; j >= 1; j--) {
    // System.out.print(j);
    // }
    // space = space - 2;
    // System.out.println();
    // }
    // }

    // public static void pattern12(int n) {
    // int printss = 1;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(printss);
    // printss++;
    // }
    // System.out.println();
    // }
    // }

    public static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // int n = 5;
        // pattern1(n);
        // int i = 5;
        // int j = 5;
        // pattern2(i, j);
        // pattern3();
        // pattern4();
        // pattern5();
        // pattern6();
        // pattern7(5);
        // pattern8(5);
        // pattern9(5);
        // pattern10(5);
        // pattern11(4);
        // pattern12(5);
        pattern13(5);
    }

}