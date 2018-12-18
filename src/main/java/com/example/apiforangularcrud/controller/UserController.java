package com.example.apiforangularcrud.controller;

import com.example.apiforangularcrud.model.UserModel;
import com.example.apiforangularcrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController  {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    private List<UserModel> getAll(){
        return userRepository.findAll();
    }

    @PostMapping("/")
    private void addData(@RequestBody UserModel userModel){
        userRepository.save(userModel);
    }

    @DeleteMapping("/{id}")
    private void deletebyid(@PathVariable int id){
        userRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    private void update(@PathVariable int id , @RequestBody UserModel unit){
        UserModel userModel = new UserModel();
        userModel = userRepository.findFirstById(id);

        userModel.setUnit_name(unit.getUnit_name());
        userModel.setUnit_price(unit.getUnit_price());

        userRepository.save(userModel);
    }

}
