package V4;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        boolean done=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator App Please provide me the Following");
        while(!done){
            System.out.print("First Number: ");
            double x = scanner.nextDouble();
            System.out.print("Second Number: ");
            double y = scanner.nextDouble();
            System.out.print("Operation: ");
            String operator = scanner.next();
            double result = calculate(x, y, operator);
            System.out.println(result);
            done = checkIfDone(scanner);
        }
        scanner.close();
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

    public static boolean checkIfDone(Scanner scanner){
        System.out.println("Would you like to do another operation (Y/N)");
        String answer = scanner.next();
        if( answer.equals("Y")||answer.equals("y")){
            return false;
        }
        return true;
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