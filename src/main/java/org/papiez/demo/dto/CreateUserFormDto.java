package org.papiez.demo.dto;

import org.hibernate.validator.constraints.NotEmpty;
import org.papiez.demo.model.Role;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateUserFormDto {

    @NotEmpty
    private String email = "";

    @NotEmpty
    private String password = "";

    @NotEmpty
    private String passwordRepeated = "";

    @NotNull
    private List<Role> roles = Collections.singletonList(Role.USER);

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getPasswordRepeated() {
        return passwordRepeated;
    }

    public void setPasswordRepeated(final String passwordRepeated) {
        this.passwordRepeated = passwordRepeated;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(final List<Role> roles) {
        this.roles = roles;
    }
}
