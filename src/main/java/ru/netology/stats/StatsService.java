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
        int averagesum = calculateSumSales(sales) / sales.length;
        return averagesum;
    }

    public int findMax(int[] sales) {//месяц с максимальными продажами
        int currentMax = sales[0];
        int month = 0;
        int monthMax = 0;
        for (int i : sales) {
            month += 1;
            if (currentMax < i) {
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
            if (currentMin > i) {
                currentMin = i;
                monthMin = month;
            }
        }
        return monthMin;
    }

    public int monthsBelowAverage(int[] sales) {// количество месяцев с продажами ниже среднего
        int numberOfMonth1 = 0;
        int averagesum = calculateAverageSumSales(sales);
        for (int i : sales) {
            if (i < averagesum) {
                numberOfMonth1 += 1;
            }
        }
        return numberOfMonth1;
    }

    public int monthsMoreAverage(int[] sales) {// количество месяцев с продажами больше среднего
        int numberOfMonth2 = 0;
        int averagesum = calculateAverageSumSales(sales);
        for (int i : sales) {
            if (i > averagesum) {
                numberOfMonth2 += 1;
            }
        }
        return numberOfMonth2;
    }
}
