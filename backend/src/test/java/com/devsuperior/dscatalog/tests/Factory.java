package com.devsuperior.dscatalog.tests;

import java.time.Instant;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

public class Factory {
	
	public static Product createProduct() {
		Product product = new Product(1L, "Product Name", "Product Description", 1.0, "gttps://ung,cin/img.png", Instant.parse("2020-10-20T00:00:00Z"));
		product.getCategories().add(new Category(2L, "Electronics"));	
		return product;
	}

	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
}