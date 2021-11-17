package com.company;

public class Main {

    public static void main(String[] args) {
        LoginHaslo loginhaslo = new LoginHaslo();


        Logowanie logowanie = new Logowanie(loginhaslo.getLoginInfo());
    }
}
