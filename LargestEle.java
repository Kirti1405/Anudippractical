public class LargestEle {
    public static void main(String args[]) {
        int arr[] = {10, 23, 34, 54, 21};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Find the largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Find the second largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Largest Element: " + max);
        System.out.println("Second Largest Element: " + secondMax);
    }
}
