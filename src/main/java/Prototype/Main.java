package Prototype;

import java.util.*;

public class Main {
    private static final List<Recommendation> recommendationDatabase = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Prototype> books = Arrays.asList(
                new Book("J.K. Rowling", "Harry Potter", "Fantasy", 1997),
                new Book("J.R.R. Tolkien", "The Hobbit", "Fantasy", 1937)
        );

        recommendationDatabase.add(new Recommendation("Fantasy Lovers", books));

        while (true) {
            System.out.println("\n1. View Recommendations\n2. Clone Recommendation\n3. Exit");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) viewRecommendations();
            else if (choice == 2) cloneRecommendation();
            else if (choice == 3) break;
            else System.out.println("Invalid choice.");
        }
    }

    private static void viewRecommendations() {
        if (recommendationDatabase.isEmpty()) System.out.println("No recommendations.");
        else recommendationDatabase.forEach(r -> {
            System.out.println(r.getTargetAudience());
            r.getRecommendations().forEach(b -> System.out.println(" - " + b));
        });
    }

    private static void cloneRecommendation() {
        viewRecommendations();
        System.out.print("Choose a recommendation to clone: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index < 0 || index >= recommendationDatabase.size()) {
            System.out.println("Invalid index.");
            return;
        }

        Recommendation original = recommendationDatabase.get(index);
        Recommendation cloned = (Recommendation) original.clone();

        System.out.print("New audience for the cloned recommendation: ");
        cloned.setTargetAudience(scanner.nextLine());

        recommendationDatabase.add(cloned);
        System.out.println("Cloned successfully!");
    }
}
