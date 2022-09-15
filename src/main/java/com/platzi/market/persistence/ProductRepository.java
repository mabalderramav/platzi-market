package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductCrudRepository;
import com.platzi.market.persistence.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> getByCategory(final int categoryId) {
        return productCrudRepository.findByCategoryIdOrderByNameAsc(categoryId);
    }

    public Optional<List<Product>> getScarceProducts(final int quantity) {
        return productCrudRepository.findByStockQuantityLessThanAndState(quantity, true);
    }

    public Optional<Product> getProduct(final int productId) {
        return productCrudRepository.findById(productId);
    }

    public Product save(final Product product) {
        return productCrudRepository.save(product);
    }

    public void delete(final int productId) {
        productCrudRepository.deleteById(productId);
    }
}
