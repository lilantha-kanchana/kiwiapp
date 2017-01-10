package com.kiwi.services;

import com.kiwi.model.User;
import com.kiwi.repository.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by malithi on 1/2/17.
 */

@Component("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {
//    private final UserRepository repository;
//
//    public LoginServiceImpl(UserRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public boolean isValidUser(String username, String password) {
//        User user = repository.findByUserName(username);
//        if (user.getUserPassWord().equalsIgnoreCase(password))
//            return true;
//        else
//            return false;
//    }


}
