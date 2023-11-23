import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to shoppinglist!");
        System.out.println("Your items will be added to shoppinglist");
        addItem();


    }

    public static String askForItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in item: ");
        return scanner.nextLine();
    }

    public static void addItem() {
        List<String> shoppingList = new ArrayList<>();
        String item = "";

        while (!item.equalsIgnoreCase("done")) {
            item = askForItem();
            shoppingList.add(item);

            if (shoppingList.size() == 10) {
                item = "done";
            }
        }
        System.out.println(shoppingList);
    }

}