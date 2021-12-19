package com.pweb1.calendarioeventos.repository;

import com.pweb1.calendarioeventos.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
