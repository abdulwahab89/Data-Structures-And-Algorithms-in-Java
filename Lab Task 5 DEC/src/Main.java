import java.util.Scanner;

public class Main {
    int[] arrayinput;

    int[] arrayInput(int array[]) {
        for (int i = 0; i < array.length; i++) {
            arrayinput[i] = array[i];
        }
        return arrayinput;
    }

    void display() {
        for (int i = 0; i < arrayinput.length; i++) {
            System.out.println(arrayinput[i]);
        }
    }
    public void main(String[] args) {
        int [] array={2,3,4};
arrayInput(array);
        display();
    }
    }