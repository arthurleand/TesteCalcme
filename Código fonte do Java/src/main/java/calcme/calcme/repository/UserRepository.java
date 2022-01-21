package calcme.calcme.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import calcme.calcme.model.UserModel;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String>{

}
