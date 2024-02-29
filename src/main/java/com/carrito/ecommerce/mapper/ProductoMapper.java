package com.carrito.ecommerce.mapper;

import com.carrito.ecommerce.dto.ProductoDto;
import com.carrito.ecommerce.model.Producto;

public class ProductoMapper {
    public static Producto mapToProduct(ProductoDto productoDto){
        Producto producto = new Producto(
                productoDto.getIdProducto(),
                productoDto.getNombreProducto(),
                productoDto.getPrecio(),
                productoDto.getCantidad()
        );
        return producto;
    }

    public static ProductoDto mapToProductDto(Producto producto){
        ProductoDto productoDto = new ProductoDto(
                producto.getIdProducto(),
                producto.getNombreProducto(),
                producto.getPrecio(),
                producto.getCantidad()
        );
        return productoDto;
    }
}
