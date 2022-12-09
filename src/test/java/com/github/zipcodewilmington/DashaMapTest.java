package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest {

    @Test
    public void setTest(){
        DashaMap map = new DashaMap();
        map.set("Dog", 1);

        String expected = "1";
        String actual = map.get("Dog");
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteTest(){

        //TODO write tests....
//        DashaMap map = new DashaMap();
//        map.set("Dog", 1);
//
//        String expected = "1";
//        String actual = map.get("Dog");
//        System.out.println(actual);
//
//        Assert.assertEquals(expected, actual);
    }


}
