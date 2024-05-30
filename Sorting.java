class Sorting {

    // public static int[] SelectionSort(int[] arr) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // int min = i;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[j] < arr[min]) {
    // min = j;
    // }
    // }
    // int k = arr[min];
    // arr[min] = arr[i];
    // arr[i] = k;
    // }
    // return arr;
    // }
    public static int[] BubbleSort(int[] arr) {

        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int k = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = k;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // int arr[] = { 13, 46, 24, 52, 20, 9 };
        // int arr1[] = SelectionSort(arr);
        // for (int i : arr1) {
        // System.out.println(i);
        // }

        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int arr1[] = BubbleSort(arr);
        for (int i : arr1) {
            System.out.println(i);
        }

    }
}