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

        DashaMap map = new DashaMap();
        map.set("Dog", 1);
        map.set("Cat", 2);
        map.delete("Cat");


        long expected = 1;
        long actual = map.size();
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        DashaMap map = new DashaMap();
        map.set("Dog", 1);
        map.set("Cat", 2);

        String expected = "2";
        String actual = map.get("Cat");
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        DashaMap map = new DashaMap();

        boolean expected = true;
        boolean actual = map.isEmpty();
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest2(){
        DashaMap map = new DashaMap();
        map.set("Dog", 1);

        boolean expected = false;
        boolean actual = map.isEmpty();
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest(){

        DashaMap map = new DashaMap();
        map.set("Dog", 1);
        map.set("Cat", 2);

        long expected = 2;
        long actual = map.size();
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest2(){

        DashaMap map = new DashaMap();

        long expected = 0;
        long actual = map.size();
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void bucketSizeTest(){

        DashaMap map = new DashaMap();
        map.set("Dog", 1);
        map.set("Cat", 2);

        long expected = 0;
        long actual = map.bucketSize("a");
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bucketSizeTest2(){

        DashaMap map = new DashaMap();
        map.set("Dog", 1);
        map.set("Cat", 2);

        long expected = 1;
        long actual = map.bucketSize("d");
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bucketSizeTest3(){

        DashaMap map = new DashaMap();
        map.set("Dog", 1);
        map.set("Dingo", 2);

        long expected = 2;
        long actual = map.bucketSize("d");
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }




}
