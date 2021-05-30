package com.sem.springdemo;

public class TrackCoach implements Coach {

    FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    public void doMyStartupStaff() {
        System.out.println("TrackCoach: inside method: doMyStartupStaff");
    }

    public void doMyCleanupStaff() {
        System.out.println("TrackCoach: inside method: doMyCleanupStaff");
    }
}
