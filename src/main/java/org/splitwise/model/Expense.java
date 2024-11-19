package org.splitwise.model;

import org.splitwise.enums.ExpenseType;

import java.util.HashMap;

public class Expense {
    private Double totalAmount;
    private ExpenseType expenseType;
    private User createdBy;

    private HashMap<User, Double> amountOwned;

    public Expense(Double totalAmount, ExpenseType expenseType, User createdBy, HashMap<User, Double> amountOwned) {
        this.totalAmount = totalAmount;
        this.expenseType = expenseType;
        this.createdBy = createdBy;
        this.amountOwned = amountOwned;
    }


    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public HashMap<User, Double> getAmountOwned() {
        return amountOwned;
    }

    public void setAmountOwned(HashMap<User, Double> amountOwned) {
        this.amountOwned = amountOwned;
    }
}
