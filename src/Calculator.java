public class Calculator {
    private double num1;
    private double num2;
    private String operation;

    public Calculator(String expression) {
        num1 = Double.parseDouble(expression.substring(0,expression.indexOf( " ")));
        num2 = Double.parseDouble(expression.substring(expression.indexOf( " ")+3));
        operation = expression.substring(expression.indexOf(" ")+1, expression.indexOf(" ")+2);
    }

    public String info() {
        return " " + num1 + " " + num2 + " " + operation;
    }
    public double add() {
        return num1 + num2;
    }
    public double subtract() {
        return num1 - num2;
    }
    public double multiply() {
        return num1 * num2;
    }
    public double divide() {
        return num1 / num2;
    }
    public double mod() {
        return num1 % num2;
    }
    public double exponent() {
        return Math.pow(num1, num2);
    }

    public double calculate(){
        if (operation.equals("+")) {
            return add();
        } else if (operation.equals("-")) {
            return subtract();
        } else if (operation.equals("*")) {
            return multiply();
        } else if (operation.equals("/")) {
            return divide();
        } else if (operation.equals("%")) {
            return mod();
        } else {
            return exponent();
        }
    }
}
