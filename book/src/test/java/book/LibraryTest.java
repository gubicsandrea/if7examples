package book;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class LibraryTest {
    private List<Book> books;

    @Before
    public void init(){
        books = Arrays.asList(
                new Book("d", "X"),
                new Book("Az", "King"),
                new Book("Java", "Y"));
    }


    @Test(expected = NullPointerException.class)
    public void testFindAllBooksByAuthorNull(){
        Library library = new Library(null);

        library.findAllBooksByAuthor("King");
    }

    @Test
    public void testFindAllBooksByAuthorEmptyList(){
        Library library = new Library(Collections.emptyList());

        List<Book> books = library.findAllBooksByAuthor("King");

        assertThat(books.size(),equalTo(0));
    }

    @Test
    public void testFindAllBooksByAuthorNotEmptyList(){
        Library library = new Library(books);

        List<Book> books = library.findAllBooksByAuthor("King");

        assertThat(books.size(),equalTo(1));
        assertThat(books.get(0).getAuthor(),equalTo("King"));
    }
}
