/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danironic;

/**
 *
 * @author danironic
 */
public class AvgSpeedMPH {
  public static void main(String[] args) {
    System.out.println("Find average speed(MPH) for runner.");
    System.out.println("Runner runs 14 kilometers in 45 minutes and 30 seconds.");
    System.out.println("1 mile = 1.6 kilometers");
    
    System.out.println();
    
    System.out.println("Kilometers ran in an hour first needs found.");
    System.out.println("Figure out how many 30 second intervals are in time ran and in an hour.");
    System.out.print("Time ran = 45 (mins) x 2 + 1 = ");
    System.out.print(45 * 2 + 1);
    System.out.println(" intervals");
    System.out.print("30 second intervals in an hour = 60 (mins) x 2 = ");
    System.out.print(60 * 2);
    System.out.println(" intervals");
    
    System.out.println();
    
    System.out.println("Now we need to find kilometers ran every 30 seconds.");
    System.out.print("KM every 30 seconds = ");
    System.out.print(14);
    System.out.print(" KM / ");
    System.out.print(45 * 2 + 1);
    System.out.print(" thirty second intervals (run time) = ");
    System.out.println(14.0 / (45 * 2 + 1));
    
    System.out.println();
    
    System.out.println("We will then times that by 120 to find kilometers ran an hour.");
    System.out.print(14.0 / (45 * 2 + 1));
    System.out.print(" x 120 = ");
    System.out.println((14.0 / (45 * 2 + 1)) * 120);
    
    System.out.println();
    
    System.out.println("We then use our km to miles formula to find MPH.");
    System.out.println("1 mile = 1.6 km");
    System.out.print((14.0 / (45 * 2 + 1)) * 120);
    System.out.print(" / 1.6 = ");
    System.out.println(((14.0 / (45 * 2 + 1)) * 120) / 1.6);
    System.out.print("The runner ran ");
    System.out.print(((14.0 / (45 * 2 + 1)) * 120) / 1.6);
    System.out.println(" miles per hour.");
    
    System.out.println();
    
    System.out.println("Easier way that Y. Daniel Liang did was:");
    System.out.println("System.out.println((14 / 45.5) * 60 / 1.6);");
    System.out.print("That equates to ");
    System.out.print((14 / 45.5) * 60 / 1.6);
    System.out.println( " miles per hour");
  }
}
