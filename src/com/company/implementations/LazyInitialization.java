package com.company.implementations;

/*
* Creates the singleton in the global access method
*/
public class LazyInitialization {
    
    private static LazyInitialization instance;

    private LazyInitialization(){
    }
/* Works fine in case of the single-threaded environment,
*  but when it comes to multithreaded systems
* (if multiple threads are inside the if condition)
*/
    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
}
