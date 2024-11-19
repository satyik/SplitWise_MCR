package org.splitwise.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private  String name;
    private  String userId;

    private List<Expense> expenseList;

    public User(String name, String userId){
        this.name = name;
        this.userId = userId;
        this.expenseList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getUserId(){
        return userId;
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setExpenseList(List<Expense> expenseList) {
        this.expenseList = expenseList;
    }
}
