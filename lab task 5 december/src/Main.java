import java.util.Scanner;

class Main{
    public static void main(String[] args) {
    Array array=new Array();
        array.arrayInput();
    array.outputArray(array.array);
    }
}
class Array{
    Scanner scanner=new Scanner(System.in);
    int [] array=new int[5];
    void arrayInput(){
        System.out.println("Enter array");
        for (int i = 0; i <5 ; i++) {
            array[i]=scanner.nextInt();
        }
    }
    int[] outputArray(int arr[]){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Array "+i+"th element "+array[i]);
        }
        return array;
    }
}