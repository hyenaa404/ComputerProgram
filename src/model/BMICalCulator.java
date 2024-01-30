/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class BMICalCulator extends Calculator {

    private String status;

    public BMICalCulator() {
    }

    public BMICalCulator(double num1, double num2) {
        super(num1, num2);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public double calResult() throws ArithmeticException{
        rs = num1 / (num2 * num2);
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide for zero!");
        }
        return rs;
    }
    
    public String setStatus(){
        if (rs> 40){
            status = "very fat";
        }
        if (rs<= 40 && rs > 30){
            status = "fat";
        }
        if (rs<= 30 && rs > 25){
            status = "overweight";
        }
        if (rs<= 25 && rs >= 19){
            status = "standard";
        }
        if (rs < 19){
            status = "under standard";
        
        }
        return status;
    }
}
