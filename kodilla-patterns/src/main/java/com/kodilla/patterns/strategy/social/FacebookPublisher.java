package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher{
    @Override
    public String share() {
        String serviceName = "Facebook";
        System.out.println(serviceName);
        return serviceName;
    }
}
