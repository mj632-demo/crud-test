package com.manthan.repository;

import com.manthan.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserCrudRepo extends CrudRepository<User, String> {
}
