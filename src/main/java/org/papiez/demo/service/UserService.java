package org.papiez.demo.service;

import org.papiez.demo.dto.CreateUserFormDto;
import org.papiez.demo.model.User;

import java.util.Collection;
import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(CreateUserFormDto form);

}
