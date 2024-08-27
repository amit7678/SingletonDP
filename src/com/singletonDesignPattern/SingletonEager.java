package com.singletonDesignPattern;
public class SingletonEager {
    private static SingletonEager singletonEager=new SingletonEager(); // Eager Initialization: The instance is created when the class is loaded.
    // This ensures that the instance is created before any threads access it.
    
    
    // Private constructor prevents instantiation from outside the class.
    private SingletonEager(){

    }
    // Public static method to provide access to the single instance of the class.
    // This method returns the instance created during class loading.
    public  static SingletonEager getsingletonEager()
    {
        return  singletonEager;
    }

}
