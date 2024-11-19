package org.splitwise.service;

import org.splitwise.model.User;
import org.splitwise.repository.UserRepository;

import java.util.Objects;
import java.util.UUID;

import static org.splitwise.Utils.Constants.NEW_USER_MESSAGE;

public class UserService {
    private final UserRepository userRepository;
    private static UserService userService;

    public UserService(){
        this.userRepository = UserRepository.getUserRepository();
    }

    public static UserService getUserService() {
        if(Objects.isNull(userService)){
            userService = new UserService();
        }
        return userService;
    }

    public String createUser(String name){
        User user = new User(
                name,
                UUID.randomUUID().toString()
        );
        userRepository.addUser(user);
        return NEW_USER_MESSAGE;
    }
}
