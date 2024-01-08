package io.bootify.practica_graph_q_l.repos;

import io.bootify.practica_graph_q_l.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LibroRepository extends JpaRepository<Libro, Long> {
}
