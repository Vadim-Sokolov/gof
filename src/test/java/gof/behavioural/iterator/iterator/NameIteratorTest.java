package gof.behavioural.iterator.iterator;

import gof.behavioural.iterator.Book;
import gof.behavioural.iterator.Library;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameIteratorTest {

    private final Library library = new Library();

    @Test
    void createIterator() {
        // GIVEN
        var expected = new Book("Aname", "Eauthor", 1950);
        var books = library.getBooks();
        var nameIterator = new NameIterator(books);


        // WHEN
        var actual = nameIterator.createIterator();

        // THEN
        assertEquals(expected, actual.next());
        while (actual.hasNext()) {
            Book book = actual.next();
            System.out.println("Book Name: " + book.getBookName() +
                    ", Author: " + book.getAuthor() +
                    ", Year Published: " + book.getYearPublished());
        }
    }
}