package com.account;

public class Account {
    private int accountBalance, pin;

    public void depositMoney(int amount) {
        if (amount > 0){
            accountBalance += amount;
        }
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void withdrawMoney(int amountToWithdraw) {
        if(amountToWithdraw <= accountBalance-1000){
            accountBalance -= amountToWithdraw;
        }
    }

    public void withdrawWithPin(int pin, int amount) {
        if (pin == 1234 && amount <= accountBalance-1000 ){
            this.pin = pin;
            accountBalance -= amount;
        }
    }
}
