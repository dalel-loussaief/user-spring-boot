package com.dalel.microsservice.service;

import java.util.List;

import com.dalel.microsservice.entities.Role;
import com.dalel.microsservice.entities.User;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(long id, Role r);

    List<User> findAllUsers();

    User findUserById(Long id);

    List<Role> findAllRoles();

    Role findRoleById(Long id);

    void deleteUser(long id);

    User removeRoleFromUser(long id, Role r);

    List<Role> findUserRolesById(Long id);
}

