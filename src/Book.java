import java.util.Objects;

public class Book {
    private String title;
    private int publishDate;
    private Author author;

    public Book(String title, int publishDate, Author author) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishDate == book.publishDate && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate, author);
    }
}


