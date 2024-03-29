package gof.behavioural.iterator.iterator;

import gof.behavioural.iterator.Book;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AuthorIterator implements BookIterator {

    private final List<Book> books;

    public AuthorIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> createIterator() {
        books.sort(Comparator.comparing(Book::getAuthor));
        return books.iterator();
    }
}
