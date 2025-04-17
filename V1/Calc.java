package V1;
public class Calc {

    public static void main(String[] args) {
        double x = 10;
        double y = 5;
        System.out.println(add(x,y));        
        System.out.println(subtract(x,y));        
        System.out.println(multiply(x,y));        
        System.out.println(divide(x,y));        
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