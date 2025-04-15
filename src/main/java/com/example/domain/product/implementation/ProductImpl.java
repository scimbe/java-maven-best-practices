package com.example.domain.product.implementation;

import com.example.domain.product.api.Product;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * Product implementation.
 * Implements the Product interface from the API layer.
 */
public class ProductImpl implements Product {

  private final UUID id;
  private final String name;
  private final String description;
  private final BigDecimal price;
  private final int stockQuantity;

  /**
   * Creates a new product with the given attributes.
   *
   * @param id            the product ID
   * @param name          the product name
   * @param description   the product description
   * @param price         the product price
   * @param stockQuantity the product stock quantity
   */
  public ProductImpl(UUID id, String name, String description, BigDecimal price, int stockQuantity) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.stockQuantity = stockQuantity;
  }

  @Override
  public UUID getId() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public BigDecimal getPrice() {
    return price;
  }

  @Override
  public int getStockQuantity() {
    return stockQuantity;
  }
}