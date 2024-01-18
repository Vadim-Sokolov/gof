package gof.behavioural.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    private String bookName;
    private String author;
    private Integer yearPublished;
}
