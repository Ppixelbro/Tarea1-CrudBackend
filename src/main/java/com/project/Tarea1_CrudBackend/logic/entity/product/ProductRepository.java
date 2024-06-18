package com.project.Tarea1_CrudBackend.logic.entity.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
