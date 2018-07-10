package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book[] a = {new Book("Java", "X"), new Book("C#", "Y")};
        List<Book> lista = Arrays.asList(a);
        List<Book> lista2 = new ArrayList<>(lista);

        lista.get(0).setAuthor("A");
        lista2.get(1).setAuthor("B");
        Book book = new Book("X", "Y");
        System.out.println(Arrays.toString(a));
        System.out.println(lista);
        System.out.println(lista2);

    }
}
