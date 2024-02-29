package com.carrito.ecommerce.service.impl;

import com.carrito.ecommerce.dto.ProductoDto;
import com.carrito.ecommerce.repository.ProductoRepository;
import com.carrito.ecommerce.service.ProductoService;

import java.util.List;

public class ProductoServiceImpl implements ProductoService {

    ProductoRepository productoRepository;
    @Override
    public ProductoDto createProduct(ProductoDto productoDto) {
        return null;
    }

    @Override
    public ProductoDto getProductById(Long idProducto) {
        return null;
    }

    @Override
    public List<ProductoDto> getAllProducts() {
        return null;
    }

    @Override
    public void deleteProduct(Long idProducto) {

    }
}
