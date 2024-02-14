package com.carrito.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDto {
    private Long idUser;
    private String nombreUsuario;
    private String nombres;
    private String apellidos;
    private String domicilio;
    private String telefono;
    private String email;
}
