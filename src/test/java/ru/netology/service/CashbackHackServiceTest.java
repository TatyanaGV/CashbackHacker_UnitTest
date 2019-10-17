package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void lowerAmountTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=900;
        int actual=cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void highAmountTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=1500;
        int actual=cashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    void equalAmountTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=1000;
        int actual=cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}