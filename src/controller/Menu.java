/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import util.Validation;

/**
 *
 * @author Admin
 */
public class Menu {
    public static int chooseInputOption(){
        System.out.println("1. Normal Calculator.");
        System.out.println("2. BMI Calculator.");
        System.out.println("3. Exit.");
        int option = Validation.inputOption(1, 3);
        return option;
    }
}
