package com.zch.bank;

public class SaveAccount implements Runnable {
    Bank bank;

    public SaveAccount(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.saveAccount();
    }
}
