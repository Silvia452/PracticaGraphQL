package io.bootify.practica_graph_q_l.service;

import io.bootify.practica_graph_q_l.domain.Libro;
import io.bootify.practica_graph_q_l.repos.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public Libro getBookById(Long id) {
        return libroRepository.findById(id).orElse(null);
    }

    public List<Libro> getAllBooks() {
        return libroRepository.findAll();
    }

    public Libro createBook(Libro libroInput) {

        Libro nuevoLibro = new Libro();
        nuevoLibro.setTitulo(libroInput.getTitulo());
        return libroRepository.save(nuevoLibro);
    }

    public Libro updateBook(Long id, Libro libroInput) {

        Libro libroExistente = libroRepository.findById(id).orElse(null);
        if (libroExistente != null) {
            libroExistente.setTitulo(libroInput.getTitulo());
            return libroRepository.save(libroExistente);
        }
        return null;
    }

    public Boolean deleteBook(Long id) {
        libroRepository.deleteById(id);
        return true; // Suponiendo que la eliminación fue exitosa
    }
}

