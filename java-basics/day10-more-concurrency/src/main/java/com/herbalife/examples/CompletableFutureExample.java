package com.herbalife.examples;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class CompletableFutureExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Supplier task = () -> {
            int count = 0;
            while (count < 5){
                System.out.println("Generating a random number...");
                MyThreadUtil.sleep(1);
                count++;
            }
            return (int)(Math.random()*100);
        };
        CompletableFuture
                .supplyAsync(task, executorService)
                .thenAccept(value -> System.out.println("Random number is " + value))
                .thenAccept(value -> System.out.println("End of completable future"))
                .join(); //Blocking call, waits for the task to complete; Similar to using Future.get()
        System.out.println("*****End of main method");
    }
}
