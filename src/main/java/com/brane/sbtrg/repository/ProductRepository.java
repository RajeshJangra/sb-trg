package com.brane.sbtrg.repository;

import com.brane.sbtrg.entity.Inventory;
import com.brane.sbtrg.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
