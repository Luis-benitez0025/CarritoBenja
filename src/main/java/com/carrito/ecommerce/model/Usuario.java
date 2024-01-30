package com.carrito.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    @Column(name = "nombreUsuario", nullable = false, length = 80)
    private String nombreUsuario;
    @Column(name = "nombres", nullable = false, length = 150)
    private String nombres;
    @Column(name = "apellidos", nullable = false, length = 150)
    private String apellidos;
    @Column(name = "domicilio", nullable = false, length = 200)
    private String domicilio;
    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;
    @Column(name = "email", nullable = false, length = 150)
    private String email;


}
