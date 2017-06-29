package com.brain;

import java.math.BigDecimal;

public class BigDecimalForCurrency {


    public static void main(String[] args) {
        int scale = 4;
        double value = 1.11111000;
        double value1 = 00000011111;
        BigDecimal tempBig = new BigDecimal(Double.toString(value1));
        tempBig = tempBig.setScale(scale, BigDecimal.ROUND_HALF_EVEN);
        String strValue = tempBig.stripTrailingZeros().toPlainString();
        System.out.println("tempBig = " + strValue);
    }
}