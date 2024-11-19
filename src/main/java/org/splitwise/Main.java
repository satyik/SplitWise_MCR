package org.splitwise;

import org.splitwise.command.CommandExecutor;
import org.splitwise.command.CommandFactory;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        CommandFactory commandFactory = new CommandFactory();
        CommandExecutor commandExecutor = new CommandExecutor();

        while(true){
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("EXIT"))
                break;

            String output = commandExecutor.executeOperation(commandFactory.getCommand(input));
            System.out.println(output);
        }
        sc.close();
    }
}