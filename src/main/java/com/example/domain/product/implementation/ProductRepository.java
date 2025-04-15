package com.example.domain.product.implementation;

import com.example.domain.product.api.Product;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Repository interface for Product entities.
 */
public interface ProductRepository {

  /**
   * Finds all products.
   *
   * @return a list of all products
   */
  List<Product> findAll();

  /**
   * Finds a product by its ID.
   *
   * @param id the product ID
   * @return an optional containing the product if found, or empty otherwise
   */
  Optional<Product> findById(UUID id);

  /**
   * Checks if a product with the given ID exists.
   *
   * @param id the product ID
   * @return true if a product with the given ID exists, false otherwise
   */
  boolean existsById(UUID id);

  /**
   * Saves a product.
   *
   * @param product the product to save
   * @return the saved product
   */
  Product save(Product product);

  /**
   * Deletes a product by its ID.
   *
   * @param id the ID of the product to delete
   */
  void deleteById(UUID id);
}