package org.malith.learning.graphqllearning.Controller;

import org.junit.jupiter.api.Test;
import org.malith.learning.graphqllearning.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

import static org.junit.jupiter.api.Assertions.*;

@GraphQlTest
class BookControlllerTest {

    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    void canGetBooks() {
        graphQlTester.documentName("books").execute().path("books").entityList(Book.class).hasSize(3);
    }
}