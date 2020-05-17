package ru.netology.statistics;

public class StatisticsService {
    public int calculateTotalMonthSales(int[] sales) {
        int TotalMonthSales = 0;

        for (int sale : sales) {
            TotalMonthSales += sale;
        }
        return TotalMonthSales;
    }


    public double calculateAverageMonthSales(int[] sales) {
        int TotalMonthSales = calculateTotalMonthSales(sales);
        int AverageMonthSales = TotalMonthSales / sales.length;

        return AverageMonthSales;
    }


    public int findNumMonthMaxSale(int[] sales) {
        int MaxSale = sales[0];
        int NumMonthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            int MonthSales = sales[i];
            if (MaxSale <= MonthSales) {
                MaxSale = MonthSales;
                NumMonthMaxSale = i;
            }
        }
        return NumMonthMaxSale + 1;
    }


    public int findNumMonthMinSale(int[] sales) {
        int MinSale = sales[0];
        int NumMonthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            int MonthSale = sales[i];
            if (MinSale >= MonthSale) {
                MinSale = MonthSale;
                NumMonthMinSale = i;
            }
        }
        return NumMonthMinSale + 1;
    }

    public int quantityMonthsUnderAverageSale(int[] sales) {
        double AverageMonthSales = calculateAverageMonthSales(sales);
        int QantityMonths = 0;
        for (int MonthSale : sales)
            if (MonthSale < AverageMonthSales) {
                QantityMonths += 1;

            }
        return QantityMonths;

    }

    public int quantityMonthsOverAverageSale(int[] sales) {
        double AverageMonthSales = calculateAverageMonthSales(sales);
        int QantityMonths = 0;
        for (int MonthSale : sales)
            if (MonthSale > AverageMonthSales) {
                QantityMonths += 1;

            }
        return QantityMonths;
    }

}







