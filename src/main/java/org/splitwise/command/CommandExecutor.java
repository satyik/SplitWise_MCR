package org.splitwise.command;

public class CommandExecutor {
    public String executeOperation(Command command){
        return command.execute();
    }
}
