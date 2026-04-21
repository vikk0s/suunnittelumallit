package assignments.assignment18.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Recommendation> recommendations = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n1. Show recommendations");
            System.out.println("2. Create new recommendation");
            System.out.println("3. Clone recommendation");
            System.out.println("4. Add book to recommendation");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showRecommendations();
                    break;
                case 2:
                    createRecommendation();
                    break;
                case 3:
                    cloneRecommendation();
                    break;
                case 4:
                    addBook();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showRecommendations() {
        for (int i = 0; i < recommendations.size(); i++) {
            System.out.println((i + 1) + ". " + recommendations.get(i));
        }
    }

    private static void createRecommendation() {
        System.out.println("Target audience: ");
        String audience = scanner.next();

        recommendations.add(new Recommendation(audience));
        System.out.println("Recommendation created for " + audience);
    }

    private static void cloneRecommendation() {
        showRecommendations();
        System.out.println("Select index to clone: ");
        int index = scanner.nextInt() - 1;

        Recommendation cloned = recommendations.get(index).clone();
        recommendations.add(cloned);

        System.out.println("Recommendation cloned.");
    }

    private static void addBook() {
        showRecommendations();
        System.out.println("Select Recommendation");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        System.out.println("Author: ");
        String author = scanner.nextLine();

        System.out.println("Title: ");
        String title = scanner.nextLine();

        System.out.println("Genre: ");
        String genre = scanner.nextLine();

        System.out.println("Publication date: ");
        String publicationDate = scanner.nextLine();

        recommendations.get(index).addBook(new Book(author, title, genre, publicationDate));

        System.out.println("Book added.");
    }
}
