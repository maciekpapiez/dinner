package org.papiez.demo.service;

import org.papiez.demo.dto.CreateUserFormDto;
import org.papiez.demo.model.User;
import org.papiez.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getUserById(long id) {
        return Optional.ofNullable(userRepository.findOne(id));
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }

    @Override
    public Collection<User> getAllUsers() {
        return userRepository.findAll(new Sort("email"));
    }

    @Override
    public User create(CreateUserFormDto form) {
        User user = new User();
        user.setEmail(form.getEmail());
        user.setPasswordHash(new BCryptPasswordEncoder().encode(form.getPassword()));
        user.setRoles(form.getRoles());
        return userRepository.save(user);
    }

}
