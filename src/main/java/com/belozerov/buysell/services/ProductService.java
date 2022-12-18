package com.belozerov.buysell.services;

import com.belozerov.buysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "Iphone 11", "Simple description", 40000, "Kazan", "Eugeni"));
        products.add(new Product(++ID, "TV", "Simple description", 25000, "Omsk", "Alexei"));
    }

    public List<Product> listProducts() {
        return products;
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}
