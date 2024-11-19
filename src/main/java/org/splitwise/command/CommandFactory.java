package org.splitwise.command;

import org.splitwise.exceptions.InvalidCommandException;

public class CommandFactory {

    public Command getCommand(String input) throws Exception {
        String[] commands = input.split(" ");
        String operation = commands[0];

        switch(operation) {
            case "EXPENSE": {

            }
            case "SHOW": {

            }
            case "CREATE": {
                return new AddUserCommand(commands);
            }
            default:
                throw new InvalidCommandException("Invalid Command, Try Again");
        }
    }
}
