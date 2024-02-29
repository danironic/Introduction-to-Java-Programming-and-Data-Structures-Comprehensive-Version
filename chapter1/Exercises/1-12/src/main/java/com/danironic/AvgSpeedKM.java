/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danironic;

/**
 *
 * @author danironic
 */
public class AvgSpeedKM {
  public static void main(String[] args) {
      

    System.out.println("(Average speed in kilometers) Assume that a runner runs 24 miles in");
    System.out.println("1 hour, 40 minutes, and 35 seconds. Write a program that displays");
    System.out.println("the average speed in kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)");
    
    System.out.println();
    
    System.out.println("Formula to find avg miles per minute:");
    System.out.print("24 (miles ran) / 100.75 minutes (1 hr 40 mins and 35 secs) = ");
    System.out.print(24 / 100.75);
    System.out.println(" miles per minute");
    // 24 (miles ran) / 100.75 minutes (1 hr 40 mins and 35 secs) = 0.23821339950372208 miles per minute
    
    System.out.println();
    
    System.out.println("Formula to turn miles to km and find avg km per hour:");
    System.out.print("0.23821339950372208 (avg miles per min) * 1.6 (mph to km) * 60 (1 hour) = ");
    System.out.print(0.23821339950372208 * 1.6 * 60);
    System.out.println(" km per hour");
    // 0.23821339950372208 (avg miles per min) * 1.6 (mph to km) * 60 (1 hour) = 22.86848635235732 km per hour
  }
}
