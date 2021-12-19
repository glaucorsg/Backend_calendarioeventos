package com.pweb1.calendarioeventos.service;

import com.pweb1.calendarioeventos.model.Usuario;
import com.pweb1.calendarioeventos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios() {
        return this.usuarioRepository.findAll();
    }

    public Usuario getUsuarioPorId(Long idUsuario) {
        return this.usuarioRepository.findById(idUsuario).orElse(null);
    }

    @Transactional
    public Usuario inserirOuAtualizar(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    public void apagar(Long id) {
        this.usuarioRepository.deleteById(id);
    }
}
