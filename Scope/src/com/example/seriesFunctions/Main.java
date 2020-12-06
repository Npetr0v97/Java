package com.example.seriesFunctions;

public class Main {

    public static void main(String[] args) {
	    String privateVar = " this is main";

        ScopeCheck scopeInstance = new ScopeCheck();

        System.out.println("PrivateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
