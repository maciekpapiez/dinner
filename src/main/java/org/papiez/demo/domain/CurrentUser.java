package org.papiez.demo.domain;

import org.papiez.demo.model.Role;
import org.papiez.demo.model.User;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.List;

public class CurrentUser extends org.springframework.security.core.userdetails.User {

    private User user;

    public CurrentUser(User user) {
        super(user.getEmail(), user.getPasswordHash(), AuthorityUtils.createAuthorityList(user.getRoles().toString()));
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Long getId() {
        return user.getId();
    }

    public List<Role> getRoles() {
        return user.getRoles();
    }

}
