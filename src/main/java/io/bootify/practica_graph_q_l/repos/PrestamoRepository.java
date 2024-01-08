package io.bootify.practica_graph_q_l.repos;

import io.bootify.practica_graph_q_l.domain.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
}
