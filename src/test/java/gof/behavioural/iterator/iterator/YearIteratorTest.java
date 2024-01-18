package gof.behavioural.iterator.iterator;

import gof.behavioural.iterator.Book;
import gof.behavioural.iterator.Library;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearIteratorTest {

    private final Library library = new Library();

    @Test
    void createIterator() {
        // GIVEN
        var expected = new Book("Dname", "Aauthor", 1940);
        var books = library.getBooks();
        var yearIterator = new YearIterator(books);


        // WHEN
        var actual = yearIterator.createIterator();

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