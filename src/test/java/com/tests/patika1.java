package com.tests;

import java.util.Timer;
import java.util.TimerTask;

public class patika1 {

    static int count = 0;

    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Merhaba");
                count++;
                if(count==10)timer.cancel();


            }
        };
        timer.schedule(timerTask, 0 ,500);

        TimerTask timerTask1 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task2");
            }
        };
        timer.schedule(timerTask1,0,200);

    }

}
