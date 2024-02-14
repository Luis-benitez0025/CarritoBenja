package com.carrito.ecommerce.service.impl;

import com.carrito.ecommerce.dto.UsuarioDto;
import com.carrito.ecommerce.mapper.UsuarioMapper;
import com.carrito.ecommerce.model.Usuario;
import com.carrito.ecommerce.repository.UsuarioRepository;
import com.carrito.ecommerce.service.UsuarioService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UsuarioDto crearUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = UsuarioMapper.mapToUsuario(usuarioDto);
        Usuario guardarUsuario = usuarioRepository.save(usuario);
        return UsuarioMapper.mapToUsuarioDto(guardarUsuario);
    }
}
