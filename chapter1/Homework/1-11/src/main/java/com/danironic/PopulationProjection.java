/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danironic;

/**
 *
 * @author danironic
 */
public class PopulationProjection {
  public static void main(String[] args) {
    System.out.println("Population projection) The U.S. Census Bureau projects population based on");
    System.out.println("the following assumptions:");
    System.out.println();
    System.out.println("- One birth every 7 seconds");
    System.out.println("- One death every 13 seconds");
    System.out.println("- One new immigrant every 45 seconds");
    
    System.out.println();
    
    System.out.println("Expected population growth for each of the next five years."); 
    System.out.println("This is assuming that the current population is 312,032,486, and one year has 365 days.");
    
    System.out.println();
    
    System.out.println("Formulas:");
    
    System.out.println();
    
    
    System.out.println("Seconds in years = 365 (days) x amount (years) x 24 (hours) x 60 (minutes) x 60 (seconds)");
    
    // 1 year  = 31,536,000  seconds
    System.out.print("1 year  = ");
    System.out.print(365 * 24 * 60 * 60);
    System.out.println("  seconds");
    
    // 2 years = 63,072,000  seconds
    System.out.print("2 years = ");
    System.out.print(365 * 2 * 24 * 60 * 60);
    System.out.println("  seconds");
    
    // 3 years = 94,608,000  seconds
    System.out.print("3 years = ");
    System.out.print(365 * 3 * 24 * 60 * 60);
    System.out.println("  seconds");
    
    // 4 years = 126,144,000 seconds
    System.out.print("4 years = ");
    System.out.print(365 * 4 * 24 * 60 * 60);
    System.out.println(" seconds");
    
    // 5 years = 157,680,000 seconds
    System.out.print("5 years = ");
    System.out.print(365 * 5 * 24 * 60 * 60);
    System.out.println(" seconds");
    
    System.out.println();
    
    
    System.out.println("Births in years = total seconds (years) / 7 (avg birth rate)");
    
    // 1 year = 4505142 births
    System.out.print("1 year  = ");
    System.out.print(31536000 / 7);
    System.out.println("  births");
    
    // 2 years = 9010285   births
    System.out.print("2 years = ");
    System.out.print(63072000 / 7);
    System.out.println("  births");
    
    // 3 years = 13515428  births
    System.out.print("3 years = ");
    System.out.print(94608000 / 7);
    System.out.println(" births");
    
    // 4 years = 17877714  births
    System.out.print("4 years = ");
    System.out.print(125144000 / 7);
    System.out.println(" births");
    
    // 5 years = 22525714  births
    System.out.print("5 years = ");
    System.out.print(157680000 / 7);
    System.out.println(" births");
    
    System.out.println();
    
   
    System.out.println("Deaths in years = total seconds (years) / 13 (avg death rate)");
    
     // 1 year  = 2425846 deaths
    System.out.print("1 year  = ");
    System.out.print(31536000 / 13);
    System.out.println("  deaths");
    
    // 2 years = 4851692  deaths
    System.out.print("2 years = ");
    System.out.print(63072000 / 13);
    System.out.println("  deaths");
    
    // 3 years = 7277538  deaths
    System.out.print("3 years = ");
    System.out.print(94608000 / 13);
    System.out.println("  deaths");
    
    // 4 years = 9703384  deaths
    System.out.print("4 years = ");
    System.out.print(126144000 / 13);
    System.out.println("  deaths");
    
    // 5 years = 12129230 deaths
    System.out.print("5 years = ");
    System.out.print(157680000 / 13);
    System.out.println(" deaths");
    
    System.out.println();
    
    // 1 year  = 700800  immigrants
    System.out.println("Immigrants in years = total seconds (years) / 45 (avg immigration rate)");
    System.out.print("1 year  = ");
    System.out.print(31536000 / 45);
    System.out.println("  immigrants");
    
    // 2 years = 1401600  immigrants
    System.out.print("2 years = ");
    System.out.print(63072000 / 45);
    System.out.println(" immigrants");
    
    // 3 years = 2102400  immigrants
    System.out.print("3 years = ");
    System.out.print(94608000 / 45);
    System.out.println(" immigrants");
    
    // 4 years = 2803200  immigrants
    System.out.print("4 years = ");
    System.out.print(126144000 / 45);
    System.out.println(" immigrants");
    
    // 5 years = 3504000  immigrants
    System.out.print("5 years = ");
    System.out.print(157680000 / 45);
    System.out.println(" immigrants");
    
    System.out.println();
    
    System.out.println("Current population is: 312,032,486 people");
    
    // Population in 1 year  = 314812582.70 people
    System.out.print("Population in 1 year  = ");
    System.out.print(String.format("%.2f", (312032486 + ((31536000 / 7.0) - (31536000 / 13.0) + (31536000 / 45.0)) ) ) );
    System.out.println(" people");
    
    // Population in 2 years = 317592679.41 people
    System.out.print("Population in 2 years = ");
    System.out.print(String.format("%.2f", (312032486 + ( (63072000 / 7.0) - (63072000 / 13.0) + (63072000 / 45.0) )) ));
    System.out.println(" people");
    
    // Population in 3 years = 320372776.11 people
    System.out.print("Population in 3 years = ");
    System.out.print(String.format( "%.2f", ( 312032486 + ( (94608000 / 7.0) - (94608000 / 13.0) + (94608000 / 45.0) ) ) ));
    System.out.println(" people");
    
    // Population in 4 years = 323152872.81 people
    System.out.print("Population in 4 years = ");
    System.out.print(String.format("%.2f", ( 312032486 + (126144000 / 7.0) - (126144000 / 13.0) + (126144000 / 45.0) ) ));
    System.out.println(" people");
    
    // Population in 5 years = 325932969.52 people
    System.out.print("Population in 5 years = ");
    System.out.print( String.format( "%.2f", ( 312032486 + (157680000 / 7.0) - (157680000 / 13.0) + (157680000 / 45.0) ) ) );
    System.out.println(" people");
  }
}
