package com.ps;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> employeesTimeCard = new ArrayList<>();
    //creating employee class and then have arrylist of employees

    public static void main(String[] args) {

        payRollReader();
        calculateGrossPay();
        payrollReport();

//        System.out.println(EmployeeData.getEmployeeIds().get(3));
//        System.out.println(EmployeeData.getEmployeeNames().get(3));
//        System.out.println(EmployeeData.getEmployeeWorkingHours().get(3));
//        System.out.println(EmployeeData.getEmployeePayRate().get(3));

    }

    // ------------ Helper Method ----------- //
    public static void payRollReader(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Payroll.csv"));

            String line;
            while((line = bufferedReader.readLine()) !=null){
                employeesTimeCard.add(line);
            }
            //System.out.println(employesTimeCard.get(0));

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void calculateGrossPay(){
        ArrayList<EachEmployeeData> processedData = EmployeeData.processEmployeeData();

        for(EachEmployeeData employee : processedData){
            double workHour = employee.getWorkingHour();
            double payRate = employee.getPayRate();
            employee.setGrossPay(workHour * payRate);
        }

    }

    public static void payrollReport(){
        System.out.println("Welcome to Payroll Report\n===================");

        ArrayList<EachEmployeeData> processedData = EmployeeData.processEmployeeData();

        for(EachEmployeeData employee : processedData){
            System.out.println("ID: " + employee.getEmployeeIds());
            System.out.println("Name: " + employee.getEmployeeNames());
            System.out.println("Hours Worked: " + employee.getWorkingHour());
            System.out.println("Pay Rate: " + employee.getPayRate());
            System.out.println("Gross Pay: " + employee.getGrossPay());
            System.out.println("-------------------");
        }

        System.out.println("Payroll processing complete");





    }

}