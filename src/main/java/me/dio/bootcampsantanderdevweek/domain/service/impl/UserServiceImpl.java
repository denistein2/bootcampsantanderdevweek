package me.dio.bootcampsantanderdevweek.domain.service.impl;

import me.dio.bootcampsantanderdevweek.domain.model.User;
import me.dio.bootcampsantanderdevweek.domain.repository.UserRepository;
import me.dio.bootcampsantanderdevweek.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("User not found with id " + id));
    }

    @Override
    public User create(User userToCreate) {
        //verificacao se o usuario ja existe na criação
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            //Mensagem de erro
            throw new IllegalArgumentException("This Account Number Already Exists");
        }
        return userRepository.save(userToCreate);
    }
}
