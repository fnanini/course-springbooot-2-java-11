package com.cursojavaspringJPA.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavaspringJPA.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
