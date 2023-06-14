package com.ohgiraffers.common;


public class PersonalAccount implements Account{

    private String accNo;

    private int balance;

    public PersonalAccount() {}


    public PersonalAccount(String accNo, int balance) {
        this.balance = balance;
        this.accNo =  accNo;

    }
    @Override
    public String getBalance() {
        // 타입 변환
//        return Integer.valueOf(this.balance).toString();
//        return String.valueOf(this.balance);
        return this.balance + "";
    }

    @Override
    public boolean deposit(int money) {

        if(money <= 0) {
            throw new IllegalArgumentException("입금 할 금액이 잘못되었어...");
        }

        this.balance += money;

        return true;
    }

    @Override
    public boolean withdraw(int money) {

        if(money > this.balance) {
            throw new IllegalArgumentException("잔액보다 큰 금액을 출금할 수 없어...");
        }

        this.balance -= money;

        return true;
    }
}
