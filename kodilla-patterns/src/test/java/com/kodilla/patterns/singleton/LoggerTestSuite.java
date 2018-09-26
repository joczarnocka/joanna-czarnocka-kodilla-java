package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite{

    @Test
    public void testGetLastLog1Message(){
        //Given
        //Logger logger = new Logger();
        //When
        String loginfo1 = "info 1";
        Logger.getInstance().log(loginfo1);
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(loginfo1,lastLog);

    }

    @Test
    public void testGetLastLog3Messages(){
        //Given
        //Logger logger = new Logger();
        //When
        String loginfo3 = "info 3";
        Logger.getInstance().log("info 1");
        Logger.getInstance().log("info 2");
        Logger.getInstance().log(loginfo3);

        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(loginfo3,lastLog);

    }


}
