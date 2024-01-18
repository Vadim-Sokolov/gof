package gof.behavioural.iterator;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Library {
    private final List<Book> books = new ArrayList<>();

    public Library() {
        books.add(new Book("Cname", "Cauthor", 1990));
        books.add(new Book("Bname", "Fauthor", 1970));
        books.add(new Book("Aname", "Eauthor", 1950));
        books.add(new Book("Fname", "Bauthor", 1960));
        books.add(new Book("Ename", "Dauthor", 1980));
        books.add(new Book("Dname", "Aauthor", 1940));
    }
}
