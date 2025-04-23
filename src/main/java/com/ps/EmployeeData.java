package com.ps;

import java.util.ArrayList;


public class EmployeeData{

    public static ArrayList<EachEmployeeData> processEmployeeData() {

        ArrayList<EachEmployeeData> employeeArrayList = new ArrayList<>();

        for (String employee : Main.employeesTimeCard) {
            String[] employeeData = employee.split("\\|");

            String id = employeeData[0];
            String name = employeeData[1];
            double workingHour = Double.parseDouble(employeeData[2]);
            double payRate = Double.parseDouble(employeeData[3]);

            EachEmployeeData eachEmployeeData = new EachEmployeeData(id, name, workingHour, payRate);
            employeeArrayList.add(eachEmployeeData);

        }
        return employeeArrayList;
    }
}

//public class EmployeeData {
//
//    //---------- Helper Methods ----------//
//
//    public static ArrayList getEmployeeIds(){
//
//        String test;
//        ArrayList<String> employeeId = new ArrayList<>();
//
//        for(String employee : Main.employeesTimeCard ){
//            String[] rawEmployeeData = employee.split("\\|");
//            String id = rawEmployeeData[0];
//            rawEmployeeData = new String[0]; // clear all the values in array
//            employeeId.add(id);
//        }
//        return employeeId;
//        //System.out.println(employeeId.get(2));
//    }
//
//    public static ArrayList getEmployeeNames(){
//
//        String test;
//        ArrayList<String> employeeNames = new ArrayList<>();
//
//        for(String employee : Main.employeesTimeCard ){
//            String[] rawEmployeeData = employee.split("\\|");
//            String names = rawEmployeeData[1];
//            rawEmployeeData = new String[0]; // clear all the values in array
//            employeeNames.add(names);
//        }
//        return employeeNames;
//        //System.out.println(employeeId.get(2));
//    }
//
//    public static ArrayList getEmployeeWorkingHours(){
//
//        String test;
//        ArrayList<String> employeeWorkingHours = new ArrayList<>();
//
//        for(String employee : Main.employeesTimeCard ){
//            String[] rawEmployeeData = employee.split("\\|");
//            String workingHours = rawEmployeeData[2];
//            //rawEmployeeData = new String[0]; // clear all the values in array
//            employeeWorkingHours.add(workingHours);
//        }
//        return employeeWorkingHours;
//        //System.out.println(employeeId.get(2));
//    }
//
//    public static ArrayList getEmployeePayRate(){
//
//        String test;
//        ArrayList<String> employeePayRate = new ArrayList<>();
//
//        for(String employee : Main.employeesTimeCard ){
//            String[] rawEmployeeData = employee.split("\\|");
//            String payRate = rawEmployeeData[3];
//            rawEmployeeData = new String[0]; // clear all the values in array
//            employeePayRate.add(payRate);
//        }
//        return employeePayRate;
//        //System.out.println(employeeId.get(2));
//    }
//
//
//}
