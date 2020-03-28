package com.zch.bank;

public class Bank {
    private String account;
    private int balance;

    public Bank(String account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "bank[" +
                "账号='" + account + '\'' +
                ", 余额=" + balance +
                ']';
    }

    //存款
    public synchronized void saveAccount() {
        int balance = this.getBalance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance += 100;
        this.setBalance(balance);
        System.out.println("存款后的账户余额为：" + balance);
    }

    //取款
    public void drawAccount() {
        synchronized (this) {

            int balance = this.getBalance();
            balance = balance - 200;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(balance);
            System.out.println("取款后的余额为：" + balance);
        }
    }
}
