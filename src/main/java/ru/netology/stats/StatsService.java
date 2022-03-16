package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1; // номер месяца, в котором был минимум продаж
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1; // Номер месяца, в котором был пик продаж
    }

    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            // sales[sumMonth] - сумма продаж
            // sale - продажи в рассматриваемом месяце
            sumMonth += sale;
        }
        return sumMonth; // сумма всех продаж
    }

    public int avgSales(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            // sales[sumMonth] - сумма продаж
            // sale - продажи в рассматриваемом месяце
            sumMonth += sale;
        }
        return sumMonth / sales.length; // Средняя сумма продаж в месяц
    }

    public int countUp(long[] sales) {
        int sumMonth = 0;
        long avgMonth = 0;
        int counter = 0;
        for (long sale : sales) {
            // sales[sumMonth] - сумма продаж
            // sale - продажи в рассматриваемом месяце
            sumMonth += sale;
        }
        avgMonth = sumMonth / sales.length;
        for (long sale : sales) {
            if (sale > avgMonth) {
                counter++;
            }
        }
        return counter; // Кол-во месяцев, в которых продажи были выше среднего
    }

    public int countLow(long[] sales) {
        int sumMonth = 0;
        long avgMonth = 0;
        int counter = 0;
        for (long sale : sales) {
            // sales[sumMonth] - сумма продаж
            // sale - продажи в рассматриваемом месяце
            sumMonth += sale;
        }
        avgMonth = sumMonth / sales.length;
        for (long sale : sales) {
            if (sale < avgMonth) {
                counter++;
            }
        }
        return counter; // Кол-во месяцев, в которых продажи были ниже среднего
    }
}
