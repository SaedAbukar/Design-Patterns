package AbstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Choose a factory (Style A or B)
        System.out.println("Choose UI style (A/B): ");
        String choice = scanner.nextLine().trim().toUpperCase();
        UIFactory factory;

        if (choice.equals("B")) {
            factory = new BFactory();
        } else {
            factory = new AFactory();
        }

        // Get user input for UI elements
        System.out.print("Enter button text: ");
        String buttonText = scanner.nextLine();

        System.out.print("Enter text field content: ");
        String textFieldText = scanner.nextLine();

        System.out.print("Enter checkbox label: ");
        String checkboxText = scanner.nextLine();

        // Create UI Elements
        Button button = factory.createButton(buttonText);
        TextField textField = factory.createTextField(textFieldText);
        Checkbox checkbox = factory.createCheckbox(checkboxText);

        // Display UI Elements
        System.out.println("\nInitial UI Elements:");
        button.display();
        textField.display();
        checkbox.display();

        // Allow user to modify text
        System.out.println("\nWould you like to change the text? (yes/no): ");
        String modify = scanner.nextLine().trim().toLowerCase();

        if (modify.equals("yes")) {
            System.out.print("Enter new button text: ");
            button.setText(scanner.nextLine());

            System.out.print("Enter new text field content: ");
            textField.setText(scanner.nextLine());

            System.out.print("Enter new checkbox label: ");
            checkbox.setText(scanner.nextLine());

            // Display updated UI Elements
            System.out.println("\nAfter text change:");
            button.display();
            textField.display();
            checkbox.display();
        }

        scanner.close();
    }
}
