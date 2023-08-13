package Q2;
import java.util.Scanner;
/************************************************************************************************************
 Nadeen Shilbayeh
 Creates a complex number class to help carry out different arithmetic operations
 *************************************************************************************************************/
public class ComplexNumberDemoNadeen {
    public static void main(String[] args){//main method

        //creates class objects
        ComplexNumber x , y;

        //defines a scanner object called input
        Scanner input = new Scanner(System.in);

        //prompts user to enter real and imaginary values for the first number
        System.out.println("Enter x's real value:");
        double realX = input.nextDouble();//reads a double type from the standard input
        System.out.println("Enter x's imaginary value:");
        double imX = input.nextDouble();//reads a double type from the standard input

        //instantiates object x
        x = new ComplexNumber(realX,imX);

        //prompts user to enter real and imaginary values for the second number
        System.out.println("Enter y's real value:");
        double realY = input.nextDouble();//reads a double type from the standard input
        System.out.println("Enter y's imaginary value:");
        double imY = input.nextDouble();//reads a double type from the standard input

        //instantiates object y
        y = new ComplexNumber(realY,imY);

        //outputs the complex numbers inputted by the user by calling the displayRecForm() method
        System.out.println("You have entered the following two complex numbers, x and y:");
        x.displayRecForm();
        System.out.println();
        y.displayRecForm();
        System.out.println();

        //create and instantiate another complex number which is the sum of the user-inputted ones
        ComplexNumber addRes = new ComplexNumber(realX+realY,imX+imY);

        //initialize the parameters for the product complex number
        double mulResReal = (realX*realY) - (imX*imY);
        double mulResIm = (imX*realY) + (realX*imY);

        //create and instantiate the product complex number
        ComplexNumber mulRes = new ComplexNumber(mulResReal, mulResIm);

        //output the arithmetic operations by calling the displayRecForm(), getMagnitude(), and getAngle() methods
        System.out.println("Here are the results of the arithmetic operations:");
        System.out.print("x + y = ");
        addRes.displayRecForm();
        System.out.printf(" , Magnitude: %.2f, Angle: %.2f degrees\n", addRes.getMagnitude(), addRes.getAngle());
        System.out.print("x * y = ");
        mulRes.displayRecForm();
        System.out.printf(" , Magnitude: %.2f, Angle: %.2f degrees\n", mulRes.getMagnitude(), mulRes.getAngle());


    }

}
