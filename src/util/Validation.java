package util;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);

    public static int inputOption(int min, int max) {
        int rs;
        while (true) {
            try {
                rs = Integer.parseInt(sc.nextLine());
                if (rs < min || rs > max) {
                    throw new ArithmeticException("Not valid. Enter a valid number from " + min + " to " + max + ".");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid integer number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return rs;
    }

    public static double inputDouble() {
        double db;
        while (true) {
            try {
                db = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid double number.");
            }
        }
        return db;
    }

    public static String inputOperator() {
        String operator;
        while (true) {
            try {
                operator = sc.nextLine().trim();
                if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") && !operator.equals("^") && !operator.equals("=") ) {

                    throw new ArithmeticException("Invalid operator.");
                }
                break;
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
            }
        }
        return operator;
    }
    
    public static double inputWeight() {
        double db;
        while (true) {
            try {
                db = Double.parseDouble(sc.nextLine());
                if(db<=0 || db > 400){
                    throw new ArithmeticException("Invalid weight. Please enter a double number bigger than 0 and no more than 300.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Weight is a digit.");
            } catch (ArithmeticException ex){
                System.err.println(ex.getMessage());
                System.out.println("Enter weight again (kg) :");
            }
        }
        return db;
    }
    
    public static double inputHeight() {
        double db;
        while (true) {
            try {
                db = Double.parseDouble(sc.nextLine());
                if(db<=0 || db > 300){
                    throw new ArithmeticException("Invalid height. Please enter a double number bigger than 0 and no more than 300.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Height is a digit.");
            } catch (ArithmeticException ex){
                System.err.println(ex.getMessage());
                System.out.println("Enter height again (cm) :");
            }
        }
        return db;
    }
}
