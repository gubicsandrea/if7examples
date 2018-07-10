package book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> findAllBooksByAuthor(String author){
        List<Book> result = new ArrayList<>();
        for (Book book: books) {
            if(book.getAuthor().equals(author)){
                result.add(book);
            }
        }
        return result;
    }
}
