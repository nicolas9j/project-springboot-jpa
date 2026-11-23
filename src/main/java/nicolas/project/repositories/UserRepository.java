package nicolas.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nicolas.project.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
