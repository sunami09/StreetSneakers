package urjc.dad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import urjc.dad.models.Product;

public interface ProductRepository  extends JpaRepository<Product, Long> {

}
