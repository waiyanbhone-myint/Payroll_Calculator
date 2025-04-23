package com.ps;

public class EachEmployeeData {
    private String employeeIds;
    private String employeeNames;
    private double workingHour;
    private double payRate;
    private double grossPay;

    public EachEmployeeData(String employeeIds, String employeeNames, double workingHour, double payRate) {
        this.employeeIds = employeeIds;
        this.employeeNames = employeeNames;
        this.workingHour = workingHour;
        this.payRate = payRate;
        //this.grossPay = grossPay;
    }

    public String getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(String employeeIds) {
        this.employeeIds = employeeIds;
    }

    public String getEmployeeNames() {
        return employeeNames;
    }

    public void setEmployeeNames(String employeeNames) {
        this.employeeNames = employeeNames;
    }

    public double getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(double workingHour) {
        this.workingHour = workingHour;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }
}
