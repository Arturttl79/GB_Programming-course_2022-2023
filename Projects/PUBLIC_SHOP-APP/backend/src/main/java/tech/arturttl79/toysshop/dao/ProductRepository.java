package tech.arturttl79.toysshop.dao;

import tech.arturttl79.toysshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}