package com.company;


import java.math.BigDecimal;

public class task5 {
    public static void main(String[] args){

        double priceWithoutVat = 9.99;
        System.out.println("Price without VAT: " + priceWithoutVat);

        double priceWithVat = 1.23*priceWithoutVat;
        System.out.println("Price with VAT: " + priceWithVat);

        double valueWithVat = priceWithVat*10000;
        System.out.println("Value with VAT: " + valueWithVat);

        double priceWithoutVat2 = valueWithVat/1.23;
        System.out.println("Value without VAT: " + priceWithoutVat2);

        //Using BigDecimal class
        System.out.println("");
        System.out.println("Same thing after using BigDecimal class");

        BigDecimal bdPriceWithoutVat = new BigDecimal("9.99");
        System.out.println("Price Without VAT: " + bdPriceWithoutVat);

        BigDecimal bdPriceWithVat = bdPriceWithoutVat.multiply(
                new BigDecimal("1.23"));

        bdPriceWithVat = bdPriceWithVat.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Price With VAT rounded: " + bdPriceWithVat);

        BigDecimal bdValueWithVat = bdPriceWithVat.multiply(
                new BigDecimal("100000"));
        System.out.println("Value with VAT: " + bdValueWithVat);

        BigDecimal bdPriceWithoutVat2 = bdValueWithVat.divide(
                new BigDecimal("1.23"),
                BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Value without VAT: " + bdPriceWithoutVat2);
    }
}
