package com.pweb1.calendarioeventos.controller;

import com.pweb1.calendarioeventos.model.Evento;
import com.pweb1.calendarioeventos.service.EventoService;
import com.pweb1.calendarioeventos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")

public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping("/eventos")
    public List<Evento> getEventos() {
        return this.eventoService.getEventos();
    }

    @GetMapping("/eventos/{id}")
    public Evento getEventoPorId(@PathVariable("id") Long idEvento) {
        return this.eventoService.getEventoPorId(idEvento);
    }

    @PostMapping("/eventos")
    public Evento inserirEvento(@RequestBody Evento evento) {
        return this.eventoService.inserirOuAtualizar(evento);
    }

    @PutMapping("/eventos/{id}")
    public Evento atualizarEvento(@RequestBody Evento evento) {
        return this.eventoService.inserirOuAtualizar(evento);
    }

    @DeleteMapping("/eventos/{id}")
    public void apagarEvento(@PathVariable("id") Long id){
        this.eventoService.apagar(id);
    }
}
