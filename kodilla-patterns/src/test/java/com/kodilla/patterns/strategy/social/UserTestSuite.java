package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials mUser = new Millenials("m1");
        YGeneration yUser = new YGeneration("y1");
        ZGeneration zUser = new ZGeneration("z1");

        //When
        System.out.println("");

        String message1 = "message 1";
        System.out.println("User " + mUser.getName());
        String post1 = mUser.sharePost(message1);

        String message2 = "message 2";
        System.out.println("User " + yUser.getName());
        String post2 = yUser.sharePost(message2);

        String message3 = "message 3";
        System.out.println("User " + zUser.getName());
        String post3 = zUser.sharePost(message3);

        //Then
        Assert.assertEquals("Facebook: " + message1, post1);
        Assert.assertEquals("Twitter: " + message2, post2);
        Assert.assertEquals("Snapchat: " + message3, post3);
    }

    ;

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials mUser = new Millenials("m1");

        //When
        System.out.println("");

        System.out.println("User " + mUser.getName());
        String message4a = "message 4a";
        String post4a = mUser.sharePost(message4a);

        mUser.setSocialPublisher(new SnapchatPublisher());

        System.out.println("User " + mUser.getName());
        String message4b = "message 4b";
        String post4b = mUser.sharePost(message4b);

        //Then
        Assert.assertEquals("Facebook: " + message4a, post4a);
        Assert.assertEquals("Snapchat: " + message4b, post4b);
    }

    ;
}
