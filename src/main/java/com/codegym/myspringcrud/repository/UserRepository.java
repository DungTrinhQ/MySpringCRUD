package com.codegym.myspringcrud.repository;

import com.codegym.myspringcrud.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
