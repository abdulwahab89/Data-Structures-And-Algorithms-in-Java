import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter working no of hours");
        int numberofhours=sc.nextInt();
        System.out.println("Enter amount");
        int amountofMoney=sc.nextInt();
        System.out.println("Enter vacation day");
        int vacationDays=sc.nextInt();
        int totalhours=numberofhours+vacationDays*8;
        int grossSalary=amountofMoney*numberofhours;
        int vacationException=amountofMoney*(totalhours-vacationDays*8);
        System.out.println(grossSalary);
        System.out.println(vacationException);
    }
}