package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
	
	public Users findByUserNameAndPassword(String userName,String password);
	
}
