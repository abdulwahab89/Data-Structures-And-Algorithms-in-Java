import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.println("Enter age");
        age=sc.nextInt();
        if(age<13){
            System.out.print("5 dollars");
        }
        else if(age>=13 && age<65){
            System.out.println("10 dollars");
        }
        else if(age>=65){
            System.out.println("7 dollars");
        }
    }
}