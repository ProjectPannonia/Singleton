package com.company.implementations;

// Best practice, when the singleton class not using a lot of resources!
public class EagerInitialization {
    // One private instace
    private static final EagerInitialization eagerInitializedSingleton = new EagerInitialization();

    // Private constructor, to avoid client applications to use constructor
    private EagerInitialization() {
    }

    // Get the only one instance with a public get method
    public static EagerInitialization getInstance(){
        return eagerInitializedSingleton;
    }
}
