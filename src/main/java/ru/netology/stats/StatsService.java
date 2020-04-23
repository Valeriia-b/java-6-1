package ru.netology.stats;

public class StatsService {
    public int calculateSumSales(int[] sales) { //сумма продаж за год
        int sum = 0;
        for (int i : sales) {
            sum += i;
        }
        return sum;
    }

    public int calculateAverageSumSales(int[] sales) { //средняя сумма продаж за месяц
        return calculateSumSales(sales) / sales.length;
    }

    public int findMax(int[] sales) {//месяц с максимальными продажами
        int monthMax = 0;
        int currentMax = sales[0];
        int month = 0;
        for (int i : sales) {
            month += 1;
            if (currentMax <= i) {
                currentMax = i;
                monthMax = month;
            }
        }
        return monthMax;
    }

    public int findMin(int[] sales) {//месяц с минимальными продажами
        int currentMin = sales[0];
        int month = 0;
        int monthMin = 0;
        for (int i : sales) {
            month += 1;
            if (currentMin >= i) {
                currentMin = i;
                monthMin = month;
            }
        }
        return monthMin;
    }

    public int monthsBelowAverage(int[] sales) {// количество месяцев с продажами ниже среднего
        int numberOfMonth = 0;
        for (int i : sales) {
            if (i <  calculateAverageSumSales(sales)) {
                numberOfMonth += 1;
            }
        }
        return numberOfMonth;
    }

    public int monthsMoreAverage(int[] sales) {// количество месяцев с продажами больше среднего
        int numberOfMonth = 0;
        for (int i : sales) {
            if (i > calculateAverageSumSales(sales)) {
                numberOfMonth += 1;
            }
        }
        return numberOfMonth;
    }
}
