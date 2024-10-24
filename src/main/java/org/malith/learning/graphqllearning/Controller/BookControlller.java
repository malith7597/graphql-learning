package org.malith.learning.graphqllearning.Controller;


import org.malith.learning.graphqllearning.Author;
import org.malith.learning.graphqllearning.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping()
public class BookControlller {


    @QueryMapping
    public List<Book> books(){
        return Book.books;
    }

    @QueryMapping
    public Book  bookById(@Argument  Integer id){
        return Book.getBookById(id);
    }

    @SchemaMapping
    public Optional<Author> author(Book book){
        return Author.getAuthorById(book.id());
    }



}
