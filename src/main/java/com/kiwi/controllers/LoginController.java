package com.kiwi.controllers;

import com.kiwi.Response;
import com.kiwi.customExceptions.RecordNotFoundException;
import com.kiwi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by malithi on 1/2/17.
 */
@Controller
public class LoginController {

    private final AtomicLong counter = new AtomicLong();
    private final UserRepository repository;
    @Autowired
    public LoginController(UserRepository repository) {
        this.repository = repository;
    }


//    @Autowired
//    private LoginService loginService;
//
//    public @ResponseBody
//    @RequestMapping(value = "/user", method = RequestMethod.GET,produces="application/json")
//    Response isValidUser(@RequestParam(value = "userName") String userName,@RequestParam(value = "passWord")String passWord){
//    //    return loginService.isValidUser(userName,passWord);
//        return new Response(HttpStatus.OK.toString(), "success!", loginService.isValidUser(userName,passWord) );
//    }


    @RequestMapping(value="/userList", method = RequestMethod.GET, produces="application/json")
    public @ResponseBody Response getAllUsers() {
        if (repository.findAll() == null) throw new RecordNotFoundException();

        return new Response(HttpStatus.OK.toString(), "success!", repository.findAll() );
    }

}
