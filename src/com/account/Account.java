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


    /*todo  Hey Grace, what happens to IF , IFELSE and ELSE statement constructs?
    I think it would be neater if i get one error message at a time, or don't you think so?
    Maybe you can decide to throw the first error (wrong pin) and when the person finally gets it right then you can now access his account and tell him he has no funds.
    How would you feel when thieves attempt to use your ATM and they are told you are a broke girl and attempting to hack your abeokuata account is a waste of time? i know you will feel good shan
    but imagine if you truly have funds ? won't they take the effort to continue trying pins?
    */
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
//@todo - Good work so far though, see you at the village ... Chibuzo Ekejiuba... Semicolon Africa