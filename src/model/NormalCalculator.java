
package model;

/**
 *
 * @author nhssss
 */
public class NormalCalculator extends Calculator{
    private String operator;

    public NormalCalculator() {
    }

    public NormalCalculator(double num1, double num2, String operator) {
        super(num1,num2);
        this.operator = operator;
    }


    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }


    @Override
    public double calResult() throws ArithmeticException{
        switch (operator){
            case "+" ->{
                rs = num1 + num2;
            }
            case "-" ->{
                rs = num1 - num2;
            }
            case "*" ->{
                rs = num1 * num2;
            }
            case "/" ->{
                rs = num1 / num2;
                if (num2 == 0){
                    throw new ArithmeticException("Cannot divide for zero!");
                }
                
            }
            case "^" ->{
                rs = Math.pow(num1, num2);
            }
        }
        return rs;
    }
    
}
