package com.herbalife.examples;

public class ThreadingExample {
    //OLD STYLE
    public static void main(String[] args) {
        Thread waggingTailThread = new Thread(new Runnable() {
            public void run() {
                while(true){
                    System.out.println("Wagging tail...");
                    MyThreadUtil.sleep(1);
                }

            }
        });

        waggingTailThread.start();

        Thread walkingThread = new Thread(() -> {
            while (true){
                System.out.println("Walking...");
                MyThreadUtil.sleep(2);
            }
        });
        walkingThread.start();
    }
}
