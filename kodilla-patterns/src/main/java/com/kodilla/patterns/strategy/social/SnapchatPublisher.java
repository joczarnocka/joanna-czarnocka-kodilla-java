package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher{
    @Override
    public String share() {
        String serviceName = "Snapchat";
        System.out.println(serviceName);
        return serviceName;
    }
}
