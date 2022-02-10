package com.example.test;

public class Main {

    public static void main(String[] args) {

        String var4 = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.userInner();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("Var3 is not accessible here " + innerClass.var3);
//        System.out.println("scopeInstance var4 is " + scopeInstance.getVar1());
//        System.out.println(var4);
//
//        scopeInstance.timesTwo();
//
//        ScopeCheck.InnerClass InnerClass = scopeInstance.new InnerClass();
//        InnerClass.timesTwo();

    }
}
