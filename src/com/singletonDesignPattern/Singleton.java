package com.singletonDesignPattern;
public class Singleton {
    private volatile  static Singleton singleton;// Volatile keyword ensures visibility of changes to variables across threads.
    // Static variable that holds the single instance of Singleton class.
    
    
    private Singleton()// Private constructor prevents instantiation from outside the class.
    {
        if(singleton!=null)  //Solution to escape form breaking the singleton using reflection api is object is already exist
        {
            throw new RuntimeException("you are trying to break singleton pattern obj is already exist");
        }

    }
    // Public static method to provide access to the single instance of the class.
    public static Singleton getsingleton() //Lazy initialization when client need then it will call
    {
    	
        if(singleton==null)  // First check to see if the instance is null without synchronization (for performance).
        {
            synchronized (Singleton.class) {  //double check locking it will lock only critical section of the code which
                // creates instance of Singleton class. Pros-- only first time t1 goes in this block rest all threads will not be synchronized
                // hence performance will be increased.
                if(singleton==null) {
                	 // Create the instance if it's still null.
                	singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
