package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher{
    @Override
    public String share() {
        String serviceName = "Twitter";
        System.out.println(serviceName);
        return serviceName;
    }
}
