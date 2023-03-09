import java.util.ArrayList;
//Reference Data Types
class Menu {
    public static void main(String[] args) {
        String menuTitle="My Dream Menu"; // Create a variable called menuTitle of type String and assign it the value "My
        // Dream Menu:".

        System.out.println(menuTitle);// Print the menuTitle variable to the console.

        ArrayList<String> menu=new ArrayList<>();// Create a variable called menu of type ArrayList.

        String starter="anything"; // Create a variable called starter of type string and pass in the name of
        // your favourite starter.

        menu.add(starter);// Add the starter variable to the ArrayList called menu.

        String mainCourse="my favourite main course";// Create a variable called mainCourse of type string and pass in the name of
        // your favourite main course.

        menu.add(mainCourse);// Add the mainCourse variable to the ArrayList called menu.

        String desert="sweet desert";// Create a variable called dessert of type string and pass in the name of
        // your favourite dessert.

        menu.add(desert);// Add the dessert variable to the ArrayList called menu.

        System.out.println(menu);// Print the menu variable to the console.

    }
}