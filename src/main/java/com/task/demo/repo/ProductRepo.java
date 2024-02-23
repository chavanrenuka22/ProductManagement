package com.task.demo.repo;
import com.task.demo.Entity.Product;

import java.awt.print.Pageable;

import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
	


}
