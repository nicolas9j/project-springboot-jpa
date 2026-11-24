package nicolas.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import nicolas.project.entities.Product;
import nicolas.project.repositories.ProductRepository;

@Component // <- Anotação que registra a classe como um componente do Spring, liberando a injetaçao com o AutoWired.
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get(); // Função GET do Optional ira retornar o Product que estiver no Objeto do tipo Opcional.
	}
}
