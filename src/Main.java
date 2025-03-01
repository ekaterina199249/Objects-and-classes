public class Main {
    public static void main(String[] args) {
        Author nil = new Author("Nil", "Gabeman");
        Author stivenKing = new Author("Stiven", "King");
        Book americanGods = new Book ("americanGods", 2015, nil);
        Book thing = new Book("Ting", 1980, stivenKing);
        Book other = new Book("Other", 1222, new Author("jhon", "Doe"));

        System.out.println(nil.equals(americanGods.getAuthor()));

        System.out.println(americanGods.getTitle() + "; " + americanGods.getPublishDate());
        americanGods.setPublishDate(2025);
        System.out.println(americanGods.getTitle() + "; " + americanGods.getPublishDate());
        System.out.println(other.getAuthor().getFirstName() + " " + other.getAuthor().getLastName());
    }
}