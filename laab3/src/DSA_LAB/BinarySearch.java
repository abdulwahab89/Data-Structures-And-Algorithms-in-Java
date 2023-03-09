package DSA_LAB;
public class BinarySearch {
    public static int bSearch(int[] a, int x) {
        int p = 0, q = a.length - 1;
        while (p <= q) {
            int i = (p + q) / 2;
            if (a[i] == x) {
                return i;
            }
            if (a[i] < x) {
                p = i + 1;
            } else
                q = i - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Index is : "+bSearch(arr, 7));
    }
}