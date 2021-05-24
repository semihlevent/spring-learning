package com.sem.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

   public static void main(String[] args) {
       // create the object
       Coach coach = new TrackCoach();
       System.out.println(coach.getDailyWorkout());
   }

}
