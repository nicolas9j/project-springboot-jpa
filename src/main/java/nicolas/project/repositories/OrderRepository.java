package nicolas.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nicolas.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
