package io.bootify.practica_graph_q_l.resolver;

import io.bootify.practica_graph_q_l.domain.Libro;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class LibroResolver implements GraphQLResolver<Libro> {

    private List<Libro> libros = new ArrayList<>();
    private Map<String, String> autores = new HashMap<>();
    private Map<String, String> categorias = new HashMap<>();

    public LibroResolver() {
        // Inicializa datos de prueba
        autores.put("1", "Autor1");
        autores.put("2", "Autor2");

        categorias.put("1", "Categoria1");
        categorias.put("2", "Categoria2");

        libros.add(new Libro("1", "Libro1", "1", "1"));
        libros.add(new Libro("2", "Libro2", "2", "2"));
    }

    public String author(Libro libro) {
        // Simula la lógica para obtener el nombre del autor por ID
        return autores.get(libro.getAutor());
    }

    public String category(Libro libro) {
        // Simula la lógica para obtener el nombre de la categoría por ID
        return categorias.get(libro.getCategoria());
    }
}

