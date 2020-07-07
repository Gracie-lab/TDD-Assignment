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

    public void setPin(int pin){
        this.pin = pin;
    }

    public int getPin(){
        return pin;
    }

    public void withdrawMoney(int pin, int amount) {
        if (amount<=accountBalance-1000 && pin == this.pin) {
            accountBalance-=amount;
        }
        if(amount>accountBalance-1000){
            System.out.println("Insufficient balance");
        }
        if(pin != this.pin){
            System.out.println("Wrong pin");
        }
    }


}
