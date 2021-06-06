/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;
import java.lang.Math;

public class APP {


    public static void main(String[] args) {
        System.out.println("Please enter the number of the month:");
        Scanner sc = new Scanner(System.in);
        String MonthString = sc.nextLine();




        int USERMonth = Integer.parseInt(MonthString);
        double TaxRate = 0;
        String OutputString  =  "The name of the month is" ;
        switch (USERMonth) {
            case 1:
                OutputString  +=  " January.";
                break;
            case 2:
                OutputString  +=  " February.";
                break;
            case 3:
                OutputString  +=  " March.";
                break;
            case 4:
                OutputString  +=  " April.";
                break;
            case 5:
                OutputString  +=  " May.";
                break;
            case 6:
                OutputString  +=  " June.";
                break;
            case 7:
                OutputString  +=  " July.";
                break;
            case 8:
                OutputString  +=  " August.";
                break;
            case 9:
                OutputString  +=  " September.";
                break;
            case 10:
                OutputString  +=  " October.";
                break;
            case 11:
                OutputString  +=  " November.";
                break;
            case 12:
                OutputString  +=  " December.";
                break;
        }
        System.out.println(OutputString);
    }


}



