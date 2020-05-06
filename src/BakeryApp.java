import java.util.ArrayList;
import java.util.Scanner;
/*
* The BakeryApp program is an implementation of an assignment from Java Bootcamp
* It the start of an application that accepts user input as search criteria of a dataset
* Zhi Cheng
* 5/5/2020
*/
public class BakeryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        BakeryStore store = new BakeryStore();
        System.out.println("Welcome to the Brookley's Better Bakery Store App! \n The Selection of the product contains peanut, gluten, soy and dairy");
        System.out.println("To Search for foods that you can eat, please enter the name of the diet restriction or q to quit ");
        System.out.println("To See a list of all our items, please type \"all\". \n ");
        input = sc.nextLine();

        ArrayList<String> goods = new ArrayList<>();

        goods = store.searchStore(input);
        System.out.println("Here is all our products: ");
        for (String items : goods) {
            System.out.println(items);
        }
    }
}
