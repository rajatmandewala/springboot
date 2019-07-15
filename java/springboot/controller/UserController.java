package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.resource.UserResource;
import springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	private UserService userService;	

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}	
	
	@PostMapping("/validuser")
	public ResponseEntity<?> validUser(@RequestBody UserResource userResource) {		
		return (userService.userValidCheck(userResource).size()==0) ?  new ResponseEntity<>("User not found",HttpStatus.OK): new ResponseEntity<>(userService.userValidCheck(userResource),HttpStatus.OK);
	}
}