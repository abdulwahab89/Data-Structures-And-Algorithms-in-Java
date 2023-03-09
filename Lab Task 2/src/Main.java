import java.util.Objects;
import java.util.Scanner;

class ContactApp {
    Scanner scan = new Scanner(System.in);
    static int size = 10;
    String[][] contacts = new String[size][2];
    static int index;

    void displayAllContacts() {
        System.out.println("Name    Mobile Number");
        for (String[] contact : contacts) {
            System.out.println(contact[0] + "    " + contact[1]);
        }
    }

    boolean searchContact(String name) {
        index = -1;
        boolean found = false;
        for (String[] contact : contacts) {
            index++;
            if (name.equals(contact[0])) {
                found = true;
                break;
            }
        }
        return found;
    }

    void addNewContact(String name, String mobile) {
        try {
            for (int i = 0; i < contacts.length; i++) {
                if (contacts[i][0] == null) {
                    contacts[i][0] = name;
                    contacts[i][1] = mobile;
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Storage is full!");
        }
    }

    void updateContact() {
        System.out.println("Enter name of contact you want to update: ");
        String name1 = scan.nextLine();
        if (searchContact(name1)) {
            System.out.println("1->Change name: \n2->Change mobile number: ");
            String choice = scan.nextLine();
            if (choice.equals("1")) {
                System.out.print("Enter new name: ");
                String updatedName = scan.nextLine();
                contacts[index][0] = updatedName;
            } else if (choice.equals("2")) {
                System.out.print("Enter new number: ");
                String no = scan.nextLine();
                contacts[index][1] = no;
            }
        } else System.out.println("Contact not found! ");

    }

    void deleteContact(String name) {
        if (searchContact(name)) {
            for (int i = index; i > 0; i--) {
                contacts[i][0] = contacts[i - 1][0];
                contacts[i][1] = contacts[i - 1][1];
            }
            contacts[0][0] = null;
            contacts[0][1] = null;
        } else System.out.println("Contact not found!");
    }


    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            ContactApp app = new ContactApp();
            app.contacts[0][0] = "Ali";
            app.contacts[0][1] = "03480331849";
            app.contacts[1][0] = "Hassan";
            app.contacts[1][1] = "03001280147";
            app.contacts[2][0] = "Akbar";
            app.contacts[2][1] = "03063488379";
            app.contacts[3][0] = "Shahrukhan";
            app.contacts[3][1] = "03248239454";
            app.contacts[4][0] = "Muzamil";
            app.contacts[4][1] = "03151345921";
            String choice;
            do {
                System.out.println("1->Display All Contacts");
                System.out.println("2->Search a contact");
                System.out.println("3->Add a new contact");
                System.out.println("4->Update the contact");
                System.out.println("5->Delete any contact");
                System.out.println("0->To exit");
                choice = scan.nextLine();
                String name, number;
                for (int i = 0; i < 30; i++) System.out.println();
                switch (choice) {
                    case "1" -> {
                        app.displayAllContacts();
                        System.out.print("Press any key");
                        String temp = scan.nextLine();
                    }
                    case "2" -> {
                        System.out.print("Enter name to search: ");
                        name = scan.nextLine();
                        if (app.searchContact(name))
                            System.out.println("Contact Found with number " + app.contacts[ContactApp.index][1]);
                        else System.out.println("Contact not found!");
                        System.out.print("Press any key");
                        String temp = scan.nextLine();
                    }
                    case "3" -> {
                        System.out.print("Enter number to add: ");
                        number = scan.nextLine();
                        System.out.print("Enter name to save this contact: ");
                        name = scan.nextLine();
                        app.addNewContact(name, number);
                        System.out.print("Press any key");
                        String temp = scan.nextLine();
                    }
                    case "4" -> {
                        app.updateContact();
                        System.out.print("Press any key");
                        String temp = scan.nextLine();
                    }
                    case "5" -> {
                        System.out.print("Enter name to delete the contact: ");
                        name = scan.nextLine();
                        app.deleteContact(name);
                        System.out.print("Press any key");
                        String temp = scan.nextLine();
                    }
                }
                for (int i = 0; i < 50; i++) System.out.println();
            } while (!Objects.equals(choice, "0"));
        }
    }
}