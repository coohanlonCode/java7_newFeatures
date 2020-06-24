package com.myJ7NewFeatures.demo;

import org.springframework.boot.SpringApplication;

public class MultiCatchExample {


    public static void main(String[] args) {

        int myNumber = 0;
        try {

            myNumber = (int) (Math.random()* 10);

            if (myNumber % 2 == 0) {
                throw new NullPointerException("I'm a NPE!");
            } else {
                throw new ArrayIndexOutOfBoundsException("I'm an AIOoBE!");
            }

        } catch (NullPointerException | ArrayIndexOutOfBoundsException myExceptParamName) {
            // catch has parm reference name ONLY ONCE AND AT THE END

            System.out.println("One of those two types of exceptions was thrown");
            System.out.println("Number = " + myNumber);
            System.out.println("Message = " + myExceptParamName.getMessage());
            System.out.println("Message = " + myExceptParamName.getMessage());
        }
    }
}
