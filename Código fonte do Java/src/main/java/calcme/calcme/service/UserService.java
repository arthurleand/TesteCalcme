package calcme.calcme.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import calcme.calcme.model.UserModel;
import calcme.calcme.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public ResponseEntity<UserModel> saveUser(UserModel user) {
		
		UserModel newUser = new UserModel();
		newUser.setNome(user.getNome());
		newUser.setEmail(user.getEmail());
		newUser.setTelefone(user.getTelefone());
		
		return ResponseEntity.status(201).body(repository.save(newUser));
	}
}
