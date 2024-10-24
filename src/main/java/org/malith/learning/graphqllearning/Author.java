package org.malith.learning.graphqllearning;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id , String name) {
    public static List<Author> authors = Arrays.asList(
            new Author(1, "Unknown" ),
            new Author(2, "J.K.Rowling" ),
            new Author(3 , "Sk")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream().filter(a-> a.id.equals(id)).findFirst();
    }


}
