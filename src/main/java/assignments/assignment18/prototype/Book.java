package assignments.assignment18.prototype;

public class Book {
    private String author;
    private String title;
    private String genre;
    private String publicationDate;

    public Book(String author, String title, String genre, String publicationDate) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publicationDate = publicationDate;
    }

    public Book clone() {
        return new Book(author, title, genre, publicationDate);
    }

    public String toString() {
        return "Book: " + title + " by " + author + " (" + genre + ", " + publicationDate + ")";
    }
}
