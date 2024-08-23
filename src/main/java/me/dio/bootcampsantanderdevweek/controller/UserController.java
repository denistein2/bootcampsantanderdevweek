package me.dio.bootcampsantanderdevweek.controller;


import me.dio.bootcampsantanderdevweek.domain.model.User;
import me.dio.bootcampsantanderdevweek.domain.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
//definir um path
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    //resposta do nosso metodo - uma response entity
    @GetMapping("/{id}")
    //retorna usuario completo caso ele exista
    public ResponseEntity<User> findById(@PathVariable Long id){
    var user = userService.findById(id);
    return  ResponseEntity.ok(user);
    }

    @PostMapping
    //retorna usuario completo caso ele exista
    public ResponseEntity<User> create(@RequestBody User userToCreate){
        var userCreated = userService.create(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return (ResponseEntity<User>) ResponseEntity.created(location);
    }




}
