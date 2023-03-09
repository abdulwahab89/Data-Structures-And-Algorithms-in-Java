import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String question="Symbol of Oxygen is: ";
        String choiceOne="H2\n";
        String choiceTwo="Al\n";
        String choiceThree="O2";
        System.out.print(question);
        System.out.print("\nChoices:"+choiceOne+choiceTwo+choiceThree);
        String answer=scanner.nextLine();
       if(answer.equals(choiceThree)){
           System.out.println("Correct Answer");
       }
       else{
           System.out.println("Wrong Answer");
       }
    }
}