package gof.behavioural.iterator.iterator;

import gof.behavioural.iterator.Book;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class NameIterator implements BookIterator {

    private final List<Book> books;

    public NameIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> createIterator() {
        books.sort(Comparator.comparing(Book::getBookName));
        return books.iterator();
    }
}
