package urjc.dad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import urjc.dad.models.Order;

public interface OrderRepository  extends JpaRepository<Order, Long> {

}
