package com.evans.repository;
import com.evans.model.UserDao;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}