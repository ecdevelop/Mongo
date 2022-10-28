package com.example.demo.Repository;

import com.example.demo.Model.User;
import org.springframework.data.mongodb.repository.*;

public interface UserRepository extends MongoRepository<User, Integer> {

}