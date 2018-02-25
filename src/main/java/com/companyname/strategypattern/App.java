package com.companyname.strategypattern;

public abstract class App 
{
    public static void main( String[] args )
    {
        Cat cat1 = new Cat();
        cat1.setName("Blanche");
        System.out.println("Cat: "+cat1.tryToFly());
        
        System.out.println();
        
        Bird bird1 = new Bird();
        bird1.setName("Cooper");
        System.out.println("Bird: "+bird1.tryToFly());
    }
}
