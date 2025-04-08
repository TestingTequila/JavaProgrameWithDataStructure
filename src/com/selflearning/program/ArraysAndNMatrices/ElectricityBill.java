package com.selflearning.program.ArraysAndNMatrices;

public class ElectricityBill {
    private int meterNumber;
    private String customerName;
    private String address;

    public void setMeterNumber(int meterNumber) {
        this.meterNumber = meterNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMeterNumber() {
        return meterNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Meter Number: " + getMeterNumber() + ", CustomerName: " + getCustomerName() + ", Customer Address: " + getAddress();
    }

    @Override
    public boolean equals(Object obj) {
        ElectricityBill electricityBill = (ElectricityBill) obj;
        boolean check = false;
        if (this.getMeterNumber() == ((ElectricityBill) obj).getMeterNumber()) {
            check = true;
        }
        return check;
    }
}
