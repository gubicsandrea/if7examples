package inheritance;

public class Book extends Item {

    private String ISBN;

    public Book(String title, String author, String ISBN) {
        super(title, author);
        if(ISBN == null || ISBN.isEmpty()){
            throw new IllegalArgumentException("...");
        }
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }
}
