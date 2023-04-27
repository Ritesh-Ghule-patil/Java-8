package com.ritesh.model;

public class RunnableExample {
    public static void main(String[] args) {

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable inner class");
            }
        });
        myThread.run();

        Thread thread = new Thread(() -> System.out.println("calling runnable run method using lambda "));
        thread.run();
    }
}
