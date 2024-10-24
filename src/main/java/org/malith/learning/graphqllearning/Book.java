package org.malith.learning.graphqllearning;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public record Book(Integer id , String name, Integer pageCount, Integer authorId) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "Yapanaya Ginilema" , 604,1),
            new Book(2, "Harry Porter", 700 ,1),
            new Book (3 , "Spring boot", 500,2)
    );

    public static Book getBookById(Integer id) {
        return books.stream().filter(b-> b.id.equals(id)).findFirst().orElse(null);
    }
}
