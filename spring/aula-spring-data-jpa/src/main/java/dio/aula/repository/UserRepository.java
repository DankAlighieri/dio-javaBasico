package dio.aula.repository;

import dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
//	QUERY METHOD
	List<User> findByNameContaining(String name);

//	Query method
	User findByUsername(String name);

//	Query override
	@Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
	List<User> filtrarPorNome(@Param("name") String name);
}
