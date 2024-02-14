package com.carrito.ecommerce.repository;

import com.carrito.ecommerce.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
}
