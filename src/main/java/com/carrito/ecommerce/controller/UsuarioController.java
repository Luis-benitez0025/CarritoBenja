package com.carrito.ecommerce.controller;

import com.carrito.ecommerce.dto.UsuarioDto;
import com.carrito.ecommerce.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrito/usuarios")
public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioDto> crearUsuario(@RequestBody UsuarioDto usuarioDto){
        return new ResponseEntity<>(usuarioService.crearUsuario(usuarioDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{idUser}")
    public ResponseEntity<String> borrarUsuario(@PathVariable Long idUser){
        usuarioService.deleteUsuario(idUser);
        return ResponseEntity.ok("El usuario se elimino con exito.");
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> getAllUsers(){
        List<UsuarioDto> usuarioDtos = usuarioService.getAllUsuers();
        return ResponseEntity.ok(usuarioDtos);
    }
}
