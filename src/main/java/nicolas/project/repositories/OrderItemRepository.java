package nicolas.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nicolas.project.entities.OrderItem;
import nicolas.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK> {

}
