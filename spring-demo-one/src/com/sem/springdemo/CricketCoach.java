package com.sem.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method -setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        System.out.println("CricketCoach: inside getter method: -getEmailAddress");
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method: -setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        System.out.println("CricketCoach: inside getter method: -getTeam");
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method: -setTeam");
        this.team = team;
    }
}
