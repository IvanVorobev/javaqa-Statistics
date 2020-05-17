package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {

    @org.junit.jupiter.api.Test
    void calculateTotalMonthSales() {
        StatisticsService service = new StatisticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateTotalMonthSales(sales);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @org.junit.jupiter.api.Test
    void calculateAverageMonthSales() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = service.calculateAverageMonthSales(sales);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @org.junit.jupiter.api.Test
    void findNumMonthMaxSale() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findNumMonthMaxSale(sales);
        assertEquals(expected, actual);
        System.out.println(actual);
    }


    @org.junit.jupiter.api.Test
    void findNumMonthMinSale() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findNumMonthMinSale(sales);
        assertEquals(expected, actual);
        System.out.println(actual);
    }


    @org.junit.jupiter.api.Test
    void quantityMonthsUnderAverageSale() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.quantityMonthsUnderAverageSale(sales);
        assertEquals(expected, actual);
        System.out.println(actual);
    }


    @org.junit.jupiter.api.Test
    void quantityMonthsOverAverageSale() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.quantityMonthsOverAverageSale(sales);
        assertEquals(expected, actual);
        System.out.println(actual);
    }
}


