package controller;

import model.BMICalCulator;
import model.NormalCalculator;
import util.Validation;

/**
 *
 * @author Admin
 */
public class Controller {

    public static void main(String[] args) {
        int choice;
        while (true) {
            choice = Menu.chooseInputOption();
            switch (choice) {
                case 1 -> {
                    calNormal();
                }
                case 2 -> {
                    calBMI();
                }
                case 3 ->
                    System.exit(0);
            }
        }
    }

    public static void calBMI() {
        System.out.print("Enter Weight(kg): ");
        double num1 = Validation.inputWeight();
        System.out.print("Enter Height (cm): ");
        double num2 = Validation.inputHeight()/100;
        BMICalCulator bmi = new BMICalCulator(num1, num2);
        double rs;
        try {
            rs = bmi.calResult();
        } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
            return;
        }
        System.out.println("BMI number: " + rs);
        System.out.println("BMI status: " + bmi.setStatus().toUpperCase());

    }

    public static void calNormal() {
        String operator = "";
        System.out.print("Enter number: ");
        double num1 = Validation.inputDouble();
        double rs = num1;
        do {
            num1 = rs;
            System.out.print("Enter operator: ");
            operator = Validation.inputOperator();
            if(operator.equals("=")){
                break;
            }
            System.out.print("Enter number: ");
            double num2 = Validation.inputDouble();
            NormalCalculator nc = new NormalCalculator(num1, num2, operator);
            try {
                rs = nc.calResult();
                System.out.println("Memory: " + rs);
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
                return;
            }
        } while (!operator.equals("="));
        System.out.println("Result: " + rs);
    }
}
