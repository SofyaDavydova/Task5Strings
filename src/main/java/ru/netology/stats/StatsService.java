package ru.netology.stats;

public class StatsService {

    // сумма всех продаж
    public long allSalesSum(long[] sales) {
        long allSales = 0; // сумма всех продаж
        for (int i = 0; i < sales.length; i++) {
            allSales = allSales + sales[i];
        }
        return allSales;
    }

    // средняя сумма продаж в месяц;
    public long averageSalesSum(long[] sales) {
        long averageSum = allSalesSum(sales) / sales.length;
        return averageSum;
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму;
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму;
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // количество месяцев, в которых продажи были ниже среднего;
    public int monthsUnderAverageSum(long[] sales) {
        int monthUnderAverage = 0; // количество месяцев, в которых продажи были ниже среднего
        long averageSum = averageSalesSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                monthUnderAverage = monthUnderAverage + 1;
            }
        }
        return monthUnderAverage;
    }

    // количество месяцев, в которых продажи были выше среднего.
    public int monthsOverAverageSum(long[] sales) {
        int monthOverAverage = 0; // количество месяцев, в которых продажи были выше среднего
        long averageSum = averageSalesSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                monthOverAverage = monthOverAverage + 1;
            }
        }
        return monthOverAverage;
    }
}
