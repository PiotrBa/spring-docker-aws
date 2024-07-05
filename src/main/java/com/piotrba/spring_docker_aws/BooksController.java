package com.piotrba.spring_docker_aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private List<Book> books = List.of(
            new Book(1L, "The Lord of the Rings", "J.R.R. Tolkien"),
            new Book(2L, "1984", "George Orwell"),
            new Book(3L, "Gone with the Wind", "Margaret Mitchell"),
            new Book(4L, "Harry Potter", "J.K. Rowling")
    );

    @GetMapping
    private List<Book> getBooks(){
        return books;
    }
}
