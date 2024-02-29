package com.carrito.ecommerce.service;

import com.carrito.ecommerce.dto.ProductoDto;
import com.carrito.ecommerce.mapper.ProductoMapper;

import java.util.List;

public interface ProductoService {
    ProductoDto createProduct(ProductoDto productoDto);
    ProductoDto getProductById(Long idProducto);
    List<ProductoDto> getAllProducts();
    void deleteProduct(Long idProducto);
}
