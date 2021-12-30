package com.LickingHeights;

import org.junit.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Question1 {
    HashMap<String, Integer> order = new HashMap<String, Integer>();


    public static void main(String[] args) {
        String result = "";

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
    }
}
