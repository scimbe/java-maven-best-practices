package com.example.domain.product.api;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Product API representation.
 * Interface defining the product domain model.
 */
public interface Product {

  /**
   * Get the product unique identifier.
   *
   * @return the product ID
   */
  UUID getId();

  /**
   * Get the product name.
   *
   * @return the product name
   */
  String getName();

  /**
   * Get the product description.
   *
   * @return the product description
   */
  String getDescription();

  /**
   * Get the product price.
   *
   * @return the product price
   */
  BigDecimal getPrice();

  /**
   * Get the product stock quantity.
   *
   * @return the product stock quantity
   */
  int getStockQuantity();
}