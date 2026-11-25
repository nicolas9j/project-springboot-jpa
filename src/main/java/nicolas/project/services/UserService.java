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
	
	public User insertUser(User obj) {
		 return repository.save(obj);
	}
	
	public void deleteUser(Long id) {
		repository.deleteById(id);
	}
	
	public User updateUser(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
