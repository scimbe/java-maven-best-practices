package com.example.domain.product.api;

/**
 * Exception thrown when a product is not found.
 */
public class ProductNotFoundException extends RuntimeException {

  /**
   * Creates a new ProductNotFoundException with the specified message.
   *
   * @param message the detail message
   */
  public ProductNotFoundException(String message) {
    super(message);
  }

  /**
   * Creates a new ProductNotFoundException with the specified message and cause.
   *
   * @param message the detail message
   * @param cause   the cause of the exception
   */
  public ProductNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}