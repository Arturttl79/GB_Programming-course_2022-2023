package tech.ksergei.bookslibrary.dao;

import tech.ksergei.bookslibrary.entity.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByTitleContaining(
        @RequestParam("title") String title,
        Pageable pageable);

    Page<Product> findByCategory(
        @RequestParam("category") String category,
        Pageable pageable);
}