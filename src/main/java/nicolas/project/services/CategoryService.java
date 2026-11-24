package nicolas.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import nicolas.project.entities.Category;
import nicolas.project.repositories.CategoryRepository;

@Component // <- Anotação que registra a classe como um componente do Spring, liberando a injetaçao com o AutoWired.
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get(); // Função GET do Optional ira retornar o Category que estiver no Objeto do tipo Opcional.
	}
}
