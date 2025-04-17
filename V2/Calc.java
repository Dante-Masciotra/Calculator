package V2;
public class Calc {

    public static void main(String[] args) {
        double x = 10;
        double y = 5;
        String operator = "+";
        double result = calculate(x, y, operator);
        System.out.println(result);
    }

    public static double calculate(double x, double y, String op){
        if(op.equals("+")){
            return add(x, y);
        }else if(op.equals("-")){
            return subtract(x, y);
        }else if(op.equals("*")){
            return multiply(x, y);
        }else if(op.equals("/") && y!=0){
            return divide(x, y);
        }else{
            return 0;
        }
    }


    public static double add(double x, double y){
        return x + y;
    }

    public static double subtract(double x, double y){
        return x - y;
    }

    public static double multiply(double x, double y){
        return x * y;
    }

    public static double divide(double x, double y){
        return x / y;
    }
}