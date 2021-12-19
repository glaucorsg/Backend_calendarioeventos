package com.pweb1.calendarioeventos.service;

import com.pweb1.calendarioeventos.model.Evento;
import com.pweb1.calendarioeventos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> getEventos() {
        return this.eventoRepository.findAll();
    }

    public Evento getEventoPorId(Long idEvento) {
        return this.eventoRepository.findById(idEvento).orElse(null);
    }

    @Transactional
    public Evento inserirOuAtualizar(Evento evento) {
        return this.eventoRepository.save(evento);
    }

    public void apagar(Long id) {
        this.eventoRepository.deleteById(id);
    }


}
