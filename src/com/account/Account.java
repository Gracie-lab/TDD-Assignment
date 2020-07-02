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
        else{
            System.out.println("minimum balance should be 1000");
        }
    }

    public void withdrawWithPin(int pin, int amount) {
        if (pin == 1234) {
            this.pin = pin;
            withdrawMoney(amount);
        }
        else{
            System.out.println("Wrong pin");
        }
    }
}
