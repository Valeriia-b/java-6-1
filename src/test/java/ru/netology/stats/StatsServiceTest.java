package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSumSales() {
        StatsService service = new StatsService ();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSumSales() {
        StatsService service = new StatsService ();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverageSumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        StatsService service = new StatsService ();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.findMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StatsService service = new StatsService ();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMin(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsBelowAverage() {
        StatsService service = new StatsService ();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsMoreAverage() {
        StatsService service = new StatsService ();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsMoreAverage(sales);
        assertEquals(expected, actual);
    }
}