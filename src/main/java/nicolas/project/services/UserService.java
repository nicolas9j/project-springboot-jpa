package nicolas.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import nicolas.project.entities.User;
import nicolas.project.repositories.UserRepository;

@Component // <- Anotação que registra a classe como um componente do Spring, liberando a injetaçao com o AutoWired.
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get(); // Função GET do Optional ira retornar o User que estiver no Objeto do tipo Opcional.
	}
}
