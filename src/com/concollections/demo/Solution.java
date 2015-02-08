package com.concollections.demo;

/**
 * Created by ADMIN on 2/1/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner inputScanner=new Scanner(System.in);
        int numberOfCases=0;
        numberOfCases=inputScanner.nextInt();
        for(int i=0;i<numberOfCases;i++){
            int input=inputScanner.nextInt();
            findProbability(input);
        }
    }

    private static void findProbability(int number){
        int favaourableCases=0;
        int totalCases=0;
        for(int j=1;j<number;j++){
            if(number%j==0){
                totalCases++;
                if(number%2==0){
                    if(Math.sqrt(number)-(int)Math.sqrt(number)<0.001){
                        favaourableCases++;
                    }
                }
            }
        }
        System.out.println(favaourableCases+"/"+totalCases);
    }
}
