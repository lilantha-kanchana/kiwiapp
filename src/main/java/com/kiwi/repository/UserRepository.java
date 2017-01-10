package com.kiwi.repository;

import com.kiwi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by malithi on 1/2/17.
 */
public interface UserRepository extends JpaRepository<User,Long> {
//    User findByUserName(@Param("userName") String name);
}
