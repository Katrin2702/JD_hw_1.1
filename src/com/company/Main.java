package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        System.out.println("Запускаю потоки");
        ThreadGroup group = new ThreadGroup("main group");

        for (int i = 1; i <= 4; i++) {
            MyThread myThread = new MyThread("Поток " + i, group);
            myThread.start();
        }
        
        Timer timer = new Timer();
        TimerTask task = new MyTask(group);
        timer.schedule(task, 10000);
    }
}
