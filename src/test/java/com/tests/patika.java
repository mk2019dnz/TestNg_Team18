package com.tests;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class patika {

    public static void main(String[] args) {


        Calendar calendar = Calendar.getInstance();

        int second = calendar.get(Calendar.SECOND);
        System.out.println("Now The seconds:" + second);
        calendar.set(Calendar.SECOND, second + 5); // sets 5 seconds future

        Date time = calendar.getTime();

        Timer scheduler = new Timer();
        TimerTask myTask = new CounterTimerTask();
        System.out.println("It will be run in 5 seconds:");
        System.out.println("Start Seconds:" + (second + 5));
        scheduler.schedule(myTask, time); // called the method run() in 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduler.cancel();
        System.out.println("The task has been run sucessfully");


    }

    private static class CounterTimerTask extends TimerTask {
        @Override
        public void run() {

        }
    }
}




