package com.blog.blog.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.blog.blog.models.user.UserEntity;
import com.blog.blog.models.user.dto.UserDto;
import com.blog.blog.services.UserService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService service;

    private static final ModelMapper modelMapper = new ModelMapper();


    @PostMapping("/")
    public void create(@RequestBody UserDto itemDto) {
        UserEntity item = modelMapper.map(itemDto, UserEntity.class);
        service.saveUser(item);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody UserDto itemDto, @PathVariable Integer id) {
        try {
            UserEntity existUser = service.getUser(id);
            UserEntity item = modelMapper.map(itemDto, UserEntity.class);
            service.saveUser(item);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteUser(id);
    }


    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> get(@PathVariable Integer id) {
        try {
            UserEntity user = service.getUser(id);
            return new ResponseEntity<UserEntity>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<UserEntity>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("")
    public List<UserEntity> list() {
        return service.listAllUser();
    }


}