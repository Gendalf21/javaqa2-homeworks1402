package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1; // номер месяца, в котором был минимум продаж
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1; // номер месяца, в котором был максимум продаж
    }

    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            sumMonth += sale;
        }
        return sumMonth; // сумма продаж за все месяцы
    }

    public int countUp(long[] sales) {
        int sumMonth = 0;
        int counter = 0;
        for (long sale : sales) {
            sumMonth += sale;
        }
        for (long sale : sales) {
            if (sale > sumMonth / sales.length) {
                counter++;
            }
        }
        return counter; // Кол-во месяцев, в которых продажи были ниже среднего
    }

    public int countLow(long[] sales) {
        int sumMonth = 0;
        int counter = 0;
        for (long sale : sales) {
            sumMonth += sale;
        }
        for (long sale : sales) {
            if (sale < sumMonth / sales.length) {
                counter++;
            }
        }
        return counter; // Кол-во месяцев, в которых продажи были ниже среднего
    }

}
