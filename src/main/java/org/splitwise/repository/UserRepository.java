package org.splitwise.repository;

import org.splitwise.model.User;

import java.util.*;

public class UserRepository implements IUserRepository{
    private final Map<String, User> userMap;
    private static UserRepository userRepository;

    public UserRepository(){
        userMap = new HashMap<>();
    }

    public static UserRepository getUserRepository(){
        if(Objects.isNull(userRepository)){
            userRepository = new UserRepository();
        }
        return userRepository;
    }

    @Override
    public void addUser(User user) {
        userMap.put(user.getName(), user);
    }

    @Override
    public List<User> getAllUser() {
        return userMap.values().stream().toList();
    }

    @Override
    public Optional<User> getUserByName(String name) {
        return Optional.ofNullable(userMap.get(name));
    }
}
