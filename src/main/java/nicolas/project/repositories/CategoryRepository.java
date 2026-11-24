package nicolas.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nicolas.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
