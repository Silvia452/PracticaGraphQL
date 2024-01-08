package io.bootify.practica_graph_q_l.controller;


import io.bootify.practica_graph_q_l.domain.Libro;
import io.bootify.practica_graph_q_l.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class LibroController {

    @Autowired
    private LibroService libroService;

    @QueryMapping
    public Libro getBookById(@Argument Long id) {
        return libroService.getBookById(id);
    }

    @QueryMapping
    public List<Libro> getAllBooks() {
        return libroService.getAllBooks();
    }

    @MutationMapping
    public Libro createBook(@Argument Libro libroInput) {
        return libroService.createBook(libroInput);
    }

    @MutationMapping
    public Libro updateBook(@Argument Long id, @Argument Libro libroInput) {
        return libroService.updateBook(id, libroInput);
    }

    @MutationMapping
    public Boolean deleteBook(@Argument Long id) {
        return libroService.deleteBook(id);
    }
}

