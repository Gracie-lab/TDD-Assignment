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
        account.depositMoney(5000);
        account.withdrawMoney(1000);
        assertEquals(4000, account.getAccountBalance());
    }

    @Test
    void accountCanWithrawWithPin(){
        account.depositMoney(5000);
        account.withdrawWithPin(1234, 1000);
        assertEquals(4000, account.getAccountBalance());
    }

    @Test
    void accountCannotWithdrawWithWrongPinTest(){
        account.depositMoney(5000);
        account.withdrawWithPin(4556, 1000);
        assertEquals(5000, account.getAccountBalance());
    }

    @Test
    void accountCanWithdrawOnlyWithinBalanceWithPinTest(){
        account.depositMoney(5000);
        account.withdrawWithPin(1234, 6000);
        assertEquals(5000, account.getAccountBalance());
    }
    @Test
    void accountCanWithdrawCashOnlyWithinBalanceTest(){
        account.depositMoney(5000);
        account.withdrawMoney(6000);
        assertEquals(5000, account.getAccountBalance());
    }

    @Test
    void accountLimitIs1000Test(){
        account.depositMoney(5000);
        account.withdrawMoney(4000);
        assertEquals(1000, account.getAccountBalance());
    }

    @Test
    void accountLimitIs100WithPinTest(){
        account.depositMoney(5000);
        account.withdrawWithPin(1234, 5000);
        assertEquals(5000, account.getAccountBalance());
    }
}