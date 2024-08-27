package com.singletonDesignPattern;
import java.lang.reflect.Constructor;

public class SingletonTest {
    public static void main(String args[])throws Exception
    {
    	  // Print the hash code of the singleton instance created using the lazy initialization Singleton pattern
        
        System.out.println(Singleton.getsingleton().hashCode());
        
        // Print the hash code again to verify that the same instance is returned
        System.out.println(Singleton.getsingleton().hashCode());

        
        // Print the hash code of the singleton instance created using the Eager initialization Singleton pattern
        System.out.println(SingletonEager.getsingletonEager().hashCode());
        // Print the hash code of the singleton instance created using the lazy initialization Singleton pattern
        System.out.println(SingletonEager.getsingletonEager().hashCode());

        Singleton s1=Singleton.getsingleton();
        System.out.println(s1.hashCode());

        // Use reflection to access the private constructor of the Singleton class
       Constructor<Singleton> constructor=  Singleton.class.getDeclaredConstructor();
      constructor.setAccessible(true);  //finally we break the singleton it change the private accessibility
        Singleton s2=constructor.newInstance();
        // Print the hash code of the new instance created via reflection
        System.out.println(s2.hashCode());

    }
}
