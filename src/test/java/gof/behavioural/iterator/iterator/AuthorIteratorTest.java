package gof.behavioural.iterator.iterator;

import gof.behavioural.iterator.Book;
import gof.behavioural.iterator.Library;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorIteratorTest {

    private final Library library = new Library();

    @Test
    void createIterator() {
        // GIVEN
        var expected = new Book("Dname", "Aauthor", 1940);
        var books = library.getBooks();
        var authorIterator = new AuthorIterator(books);


        // WHEN
        var actual = authorIterator.createIterator();

        // THEN
        assertEquals(expected, actual.next());
    }
}