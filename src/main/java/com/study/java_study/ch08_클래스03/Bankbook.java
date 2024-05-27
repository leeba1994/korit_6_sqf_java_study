package com.study.java_study.ch08_클래스03;

public class Bankbook {
    private String accountnumber;
    private String accountname;
    private int balance;

    public Bankbook(String accountnumber, String accountname, int balance) {
        this.accountnumber = accountnumber;
        this.accountname = accountname;
        this.balance = balance;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



}
