package com.example.apiforangularcrud.repository;

import com.example.apiforangularcrud.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel , Integer> {
    UserModel findFirstById(int id);

}
