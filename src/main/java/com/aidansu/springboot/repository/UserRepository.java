package com.aidansu.springboot.repository;

import com.aidansu.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by aidan on 17-5-3.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findById(long id);
}
