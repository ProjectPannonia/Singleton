package com.company.implementations;

public class BillPughSingleton {

    private BillPughSingleton(){
    }

    private static class SingletonHepler{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHepler.INSTANCE;
    }
}
