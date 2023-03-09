public class Main {
    void reverseArray(int arr[], int start, int end) {
        int temp;
        start=0;
        end =4;
        while (start<end){
             temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        start++;
            end--;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        int []array={1,2,3,4,5};
       // m.printArray(array);
    m.reverseArray(array,0,4);
    //m.printArray(array,4);
    }
}