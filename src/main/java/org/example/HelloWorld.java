package org.example;

public class HelloWorld {
    public String getGreeting() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        System.out.println(hello.getGreeting());
    }
}