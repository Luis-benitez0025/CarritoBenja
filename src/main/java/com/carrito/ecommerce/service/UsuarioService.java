package com.carrito.ecommerce.service;

import com.carrito.ecommerce.dto.UsuarioDto;

import java.util.List;

public interface UsuarioService {
    public UsuarioDto crearUsuario(UsuarioDto usuarioDto);
    public void deleteUsuario(Long idUser);
    public List<UsuarioDto> getAllUsuers();
}
