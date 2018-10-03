package com.kodilla.patterns.strategy.social;

public class User {
    private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    String sharePost(String message){
        String totalMessage = socialPublisher.share() + ": " + message;
        System.out.println(totalMessage);
        return totalMessage;
    }
}
