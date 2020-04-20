package ru.netology.stats;

public class Main {
    public static void main (String[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = service.calculateSumSales(sales);
        System.out.println(sum);

        int averagesum = service.calculateAverageSumSales(sales);
        System.out.println(averagesum);

        int monthMax = service.findMax (sales);
        System.out.println(monthMax);

        int monthMin = service.findMin (sales);
        System.out.println(monthMin);

        int numberOfMonth1 = service.monthsBelowAverage (sales);
        System.out.println(numberOfMonth1);

        int numberOfMonth2 = service.monthsMoreAverage (sales);
        System.out.println(numberOfMonth2);

    }
}
