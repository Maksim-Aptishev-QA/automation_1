package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void should1Test() {
         CashbackHackService cashbackHackService = new CashbackHackService();

         int amount = 500;
         int actual = cashbackHackService.remain(amount);
         int expected = 500;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should2Test() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should3Test() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

}
