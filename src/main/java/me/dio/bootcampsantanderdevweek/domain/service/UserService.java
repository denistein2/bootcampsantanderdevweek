package me.dio.bootcampsantanderdevweek.domain.service;

import me.dio.bootcampsantanderdevweek.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);

}
