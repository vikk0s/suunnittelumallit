package assignments.assignment18.prototype;

import java.util.ArrayList;
import java.util.List;

public class Recommendation {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void setTargetAudience(String audience) {
        this.targetAudience = audience;
    }

    public Recommendation clone() {
        Recommendation cloned = new Recommendation(this.targetAudience);

        for (Book book : this.books) {
            cloned.addBook(book.clone());
        }
        return cloned;
    }

    public String toString() {
        return "Recommendation for " + targetAudience + ":\n" + books;
    }
}
