package org.splitwise.repository;

import org.splitwise.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserRepository {
    void addUser(User user);

    List<User> getAllUser();

    Optional<User> getUserByName(String name);
}
