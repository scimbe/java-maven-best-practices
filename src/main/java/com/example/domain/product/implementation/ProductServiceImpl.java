package com.example.domain.product.implementation;

import com.example.domain.product.api.Product;
import com.example.domain.product.api.ProductNotFoundException;
import com.example.domain.product.api.ProductService;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Implementation of the ProductService interface.
 */
@Service
public class ProductServiceImpl implements ProductService {

  private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);
  private final ProductRepository productRepository;

  /**
   * Creates a new ProductServiceImpl with the given repository.
   *
   * @param productRepository the product repository
   */
  public ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public List<Product> findAll() {
    log.debug("Finding all products");
    return productRepository.findAll();
  }

  @Override
  public Optional<Product> findById(UUID id) {
    log.debug("Finding product with ID: {}", id);
    return productRepository.findById(id);
  }

  @Override
  public Product create(Product product) {
    log.info("Creating new product: {}", product.getName());
    return productRepository.save(product);
  }

  @Override
  public Product update(UUID id, Product product) throws ProductNotFoundException {
    log.info("Updating product with ID: {}", id);
    
    if (!productRepository.existsById(id)) {
      throw new ProductNotFoundException("Product not found with ID: " + id);
    }
    
    return productRepository.save(product);
  }

  @Override
  public void delete(UUID id) throws ProductNotFoundException {
    log.info("Deleting product with ID: {}", id);
    
    if (!productRepository.existsById(id)) {
      throw new ProductNotFoundException("Product not found with ID: " + id);
    }
    
    productRepository.deleteById(id);
  }
}