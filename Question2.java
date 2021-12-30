package com.LickingHeights;

import org.junit.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

//        BAGIAN A

        String result = "";
//        input total
        Scanner scanner = new Scanner( System.in );
        System.out.print("Enter ur total: ");

        double totalBelanja = scanner.nextDouble();

        boolean resultBool = false;
        if (totalBelanja == 52000000) {
            resultBool = true;
            assert resultBool = true: "Test Passed";
            System.out.println("Test Passed, Total is, Rp " + totalBelanja);
        } else {
            resultBool = false;
            assert  resultBool = false: "Test Failed";
            System.out.println(resultBool);
        }


//        BAGIAN B
        Object orderNumber = 76542019;

        if (orderNumber instanceof Integer){
            System.out.println("Test Passed, Data type is (Integer)");
        }  else if (orderNumber instanceof String) {
            System.out.println("Test Failed, Data type is (String)");
        } else if (orderNumber instanceof Boolean){
            System.out.println("Test Failed, Data type is (Boolean)");
        }
    }
}
