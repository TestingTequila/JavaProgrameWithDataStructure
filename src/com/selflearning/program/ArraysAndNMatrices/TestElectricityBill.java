package com.selflearning.program.ArraysAndNMatrices;

public class TestElectricityBill {
    public static void main(String[] args) {
        ElectricityBill electricityBill1 = new ElectricityBill();
        electricityBill1.setMeterNumber(4325);
        electricityBill1.setCustomerName("Ashish Mishra");
        electricityBill1.setAddress("Signature Global Park 2 & 3, Sohna, Gurgaon");
        System.out.println(electricityBill1);

        System.out.println("========================================");
        ElectricityBill electricityBill2 = new ElectricityBill();
        electricityBill2.setMeterNumber(4325);
        electricityBill2.setCustomerName("Ashish Mishra");
        electricityBill2.setAddress("Signature Global Park 2 & 3, Sohna, Gurgaon");
        System.out.println(electricityBill1);

        System.out.println(electricityBill1.equals(electricityBill2));

    }
}
