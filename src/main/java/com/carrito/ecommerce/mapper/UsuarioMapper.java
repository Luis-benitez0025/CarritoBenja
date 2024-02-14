package com.carrito.ecommerce.mapper;

import com.carrito.ecommerce.dto.UsuarioDto;
import com.carrito.ecommerce.model.Usuario;

public class UsuarioMapper {
    public static Usuario mapToUsuario(UsuarioDto usuarioDto){
        Usuario usuario = Usuario.builder()
                .idUser(usuarioDto.getIdUser())
                .nombreUsuario(usuarioDto.getNombreUsuario())
                .nombres(usuarioDto.getNombres())
                .apellidos(usuarioDto.getApellidos())
                .domicilio(usuarioDto.getDomicilio())
                .telefono(usuarioDto.getTelefono())
                .email(usuarioDto.getEmail())
                .build();
        return usuario;
    }

    public static UsuarioDto mapToUsuarioDto(Usuario usuario){
        UsuarioDto usuarioDto = UsuarioDto.builder()
                .idUser(usuario.getIdUser())
                .nombreUsuario(usuario.getNombreUsuario())
                .nombres(usuario.getNombres())
                .apellidos(usuario.getApellidos())
                .domicilio(usuario.getDomicilio())
                .telefono(usuario.getTelefono())
                .email(usuario.getEmail())
                .build();
        return usuarioDto;
    }
}
