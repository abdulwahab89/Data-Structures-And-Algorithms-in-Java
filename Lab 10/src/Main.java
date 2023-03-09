public class Main{

    public static int binarySearch(int[] array, int target, int low, int high) {
        if (low > high) {
            return -1;
        }


        int mid = (low + high) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            return binarySearch(array, target, mid + 1, high);
        } else {
            return binarySearch(array, target, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch(array, target, 0, array.length - 1);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
}}}