package com.example.domain.product.api;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Product service interface.
 * Defines the operations that can be performed on products.
 */
public interface ProductService {

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
   * Creates a new product.
   *
   * @param product the product to create
   * @return the created product
   */
  Product create(Product product);

  /**
   * Updates an existing product.
   *
   * @param id      the ID of the product to update
   * @param product the updated product data
   * @return the updated product
   * @throws ProductNotFoundException if the product with the given ID does not exist
   */
  Product update(UUID id, Product product) throws ProductNotFoundException;

  /**
   * Deletes a product by its ID.
   *
   * @param id the ID of the product to delete
   * @throws ProductNotFoundException if the product with the given ID does not exist
   */
  void delete(UUID id) throws ProductNotFoundException;
}