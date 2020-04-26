package com.company;

import com.company.implementations.StaticBlockInitialization;

public class Main {

    public static void main(String[] args) {

        StaticBlockInitialization instance = StaticBlockInitialization.getInstance();
        StaticBlockInitialization instance2 = StaticBlockInitialization.getInstance();
        System.out.println(instance.equals(instance2));
    }
}
