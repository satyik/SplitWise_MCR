package org.splitwise.command;

import org.splitwise.service.UserService;

public class AddUserCommand implements Command{

    private final String[] commands;

    private final UserService userService;

    public AddUserCommand(String[] command){
        this.commands = command;
        this.userService = UserService.getUserService();
    }
    @Override
    public String execute() {
        return userService.createUser(commands[1]);
    }
}
