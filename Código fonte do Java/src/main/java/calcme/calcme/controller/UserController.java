package calcme.calcme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calcme.calcme.model.UserModel;
import calcme.calcme.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(originPatterns = "*", allowedHeaders = "*")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping
	public ResponseEntity<UserModel> saveUser(@RequestBody UserModel user){
		return service.saveUser(user);
	}
}
