package com.carrito.ecommerce.service.impl;

import com.carrito.ecommerce.dto.UsuarioDto;
import com.carrito.ecommerce.mapper.UsuarioMapper;
import com.carrito.ecommerce.model.Usuario;
import com.carrito.ecommerce.repository.UsuarioRepository;
import com.carrito.ecommerce.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Crear usuario
    @Override
    public UsuarioDto crearUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = UsuarioMapper.mapToUsuario(usuarioDto);
        Usuario usuarioGuardado = usuarioRepository.save(usuario);
        return UsuarioMapper.mapToUsuarioDto(usuarioGuardado);
    }

    // Borrar usuario por id
    @Override
    public void deleteUsuario(Long idUser) {
        Usuario usuario = usuarioRepository.findById(idUser)
                .orElseThrow(()-> new RuntimeException("El usuario no existe"));
        usuarioRepository.deleteById(idUser);
    }

    // Obtener todos los usuarios
    @Override
    public List<UsuarioDto> getAllUsuers() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream().map(usuario -> UsuarioMapper.mapToUsuarioDto(usuario))
                .collect(Collectors.toList());
    }
}
