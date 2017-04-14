import java.util.Scanner;

/**
 * Created by William Yu on 4/12/2017.
 */
public class MathClassDemo {

    public static void main(String [] args){

        System.out.println("Enter two numbers to find the power of");
        System.out.println("Enter the first number");
        Scanner keyboard = new Scanner(System.in);
        double var1 = Double.parseDouble(keyboard.next());
        System.out.println("Enter the number you want to take the first number to the power of");
        double var2 = Double.parseDouble(keyboard.next());
        System.out.println("The number " + var1 +" raised to the power of "+var2+" is " + demoPower(var1, var2));
        System.out.println("Enter two numbers to add");
        var1 = Double.parseDouble(keyboard.next());
        var2 = Double.parseDouble(keyboard.next());
        System.out.println("The number " + var1 + " + " + var2 + " is " + demoAddition(var1,var2));
        System.out.println("Enter a number to be square rooted, followed by a positive or negative integer, followed by an integer");
        var1 = Double.parseDouble(keyboard.next());
        var2 = Double.parseDouble(keyboard.next());
        double var3 = Double.parseDouble(keyboard.next());
        System.out.println(demoFunction(var1,var2,var3));

    }
    public static int demoPower(double initialValue, double power){
        int result =1;
        for (int count = 1; count<=power; count++){
            result *= initialValue;
        }
        return (result);
    }
    public static double demoAddition(double firstValue, double secondValue){
        return(firstValue+=secondValue);
    }
    public static double demoFunction(double sqrtValue, double absoluteValue, double powerValue){
        sqrtValue=Math.pow(sqrtValue,.5);
        if (absoluteValue<0){
            absoluteValue*=-1;
        }

        return(sqrtValue+absoluteValue+demoPower(powerValue, absoluteValue));
    }
}
