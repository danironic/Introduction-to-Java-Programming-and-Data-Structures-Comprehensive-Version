/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danironic;

/**
 *
 * @author danironic
 */
public class ApproximatePi {
  public static void main(String[] args) {
    System.out.print("π = 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = ");
    System.out.println(4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));
    
    System.out.print("π = 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = ");
    System.out.println(4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));
  }
}
