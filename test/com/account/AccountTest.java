package com.account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;


    @BeforeEach
    void setUp() {
        account = new Account();
        // create account object before each test
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void accountObectIsNotNullTest(){
        assertNotNull(account);
    }

    @Test
    void accountObjectCanReceiveDepositTest(){
        account.depositMoney(2500);
        assertEquals(2500, account.getAccountBalance());

        account.depositMoney(5000);
        assertEquals(7500, account.getAccountBalance());
    }

    @Test
    void accountObjectWillNotTakeNegativeAmountTest(){
        account.depositMoney(5000);
        account.depositMoney(-1500);
        int accountBalance = account.getAccountBalance();
        assertEquals(5000, accountBalance);
    }

    @Test
    void accountObjectCanWithdrawTest(){
        account.setPin(1234);
        account.depositMoney(5000);
        account.withdrawMoney(1234, 1000);
        assertEquals(4000, account.getAccountBalance());
    }

    @Test
    void accountCannotWithdrawWithWrongPinTest(){
        account.setPin(1234);
        account.depositMoney(5000);
        account.withdrawMoney(4556, 4000);
        assertEquals(5000, account.getAccountBalance());
    }

    @Test
    void accountCanWithdrawOnlyWithinBalanceTest(){
        account.setPin(1234);
        account.depositMoney(5000);
        account.withdrawMoney(1234, 6000);
        assertEquals(5000, account.getAccountBalance());
    }

    @Test
    void accountLimitIs1000Test(){
        account.depositMoney(5000);
        account.setPin(1234);
        account.withdrawMoney(1234, 5000);
        assertEquals(5000, account.getAccountBalance());
    }

    @Test
    void withdrawNotWithinBalancePrintsErrorMessage(){
        account.depositMoney(5000);
        account.withdrawMoney(1234, 6000);
    }

    @Test
    void accountObjectCanChangePinTest(){
        account.setPin(1234);
        account.setPin(2468);
        assertEquals(2468, account.getPin());
    }
}