package com.pweb1.calendarioeventos.repository;

import com.pweb1.calendarioeventos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
}
