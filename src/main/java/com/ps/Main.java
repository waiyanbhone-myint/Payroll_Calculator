package com.ps;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> employesTimeCard = new ArrayList<>();
    //creating employee class and then have arrylist of employees

    public static void main(String[] args) {

        payRollReader();

        System.out.println(EmployeeData.getEmployeeIds().get(3));
        System.out.println(EmployeeData.getEmployeeNames().get(3));
        System.out.println(EmployeeData.getEmployeeWorkingHours().get(3));
        System.out.println(EmployeeData.getEmployeePayRate().get(3));

    }

    // ------------ Helper Method ----------- //
    public static void payRollReader(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Payroll.csv"));

            String line;
            while((line = bufferedReader.readLine()) !=null){
                employesTimeCard.add(line);
            }
            //System.out.println(employesTimeCard.get(0));

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}