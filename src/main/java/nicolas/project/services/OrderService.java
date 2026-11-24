package nicolas.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import nicolas.project.entities.Order;
import nicolas.project.repositories.OrderRepository;

@Component // <- Anotação que registra a classe como um componente do Spring, liberando a injetaçao com o AutoWired.
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get(); // Função GET do Optional ira retornar o User que estiver no Objeto do tipo Opcional.
	}
}
