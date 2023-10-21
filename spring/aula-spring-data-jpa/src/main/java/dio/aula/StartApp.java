package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	@Override
	public void run(String... args) throws Exception {
		List<User> users = repository.findByNameContaining("Guilherme");
//		insertUser("Gabriel Santos", "Laukim", "dio123");
		for(User u : repository.findAll()){
			System.out.println(u);
		}
	}

	private void insertUser(String name, String userName, String password) {
		User user = new User();
		user.setName(name);
		user.setUsername(userName);
		user.setPassword(password);

		repository.save(user);
	}
}
