package springboot.resource;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import springboot.model.Users;

@Component
public class UserTypeMapper {	
	
	public UserTypeResource fromUser(Users users){
		UserTypeResource resource=new UserTypeResource();
		resource.setUserId(users.getId());
		resource.setUserName(users.getUserName());
		return resource;
	}
	
	public List<UserTypeResource> fromAllUsers(List<Users> usersList){		
		return usersList.stream().map(result->fromUser(result)).collect(Collectors.toList());
	}
	
//	public Users fromUserValid(UserValidCheckResource userValidCheckResource){		
//		Users users=new Users();
//		users.setUserName(userResource.getUserName());
//		users.setPassword(userResource.getPassword());
//		return users;		
//	}	
	
	public UserValidCheckResource fromUsers(Users users){
		UserValidCheckResource validCheckResource=new UserValidCheckResource();
		validCheckResource.setUserId(users.getId());
		validCheckResource.setUserName(users.getUserName());
		validCheckResource.setRole(users.getRole().get(0).getRole());
		return validCheckResource;
	}
}
