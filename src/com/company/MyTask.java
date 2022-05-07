package com.company;

import java.util.TimerTask;

public class MyTask extends TimerTask {
    private ThreadGroup groupName;

    public MyTask(ThreadGroup groupName) {
        this.groupName = groupName;
    }

    public void run() {
        System.out.println("Завершаю все потоки");
        groupName.interrupt();
    }
}
