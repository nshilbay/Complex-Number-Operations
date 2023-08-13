package Q2;
public class ComplexNumber {
    //declare private variables
    private double real;
    private double imaginary;

    //default constructor method
    public ComplexNumber(){
        real = 0;
        imaginary = 0;
    }

    //constructor method that uses a real and imaginary value as its parameters
    public ComplexNumber(double re, double im){
        real = re;
        imaginary = im;
    }

    //double method to get magnitude of the imaginary number
    public double getMagnitude(){
        return Math.sqrt(Math.pow(real,2)+Math.pow(imaginary,2));
    }

    //double method to get the angle of the imaginary number
    public double getAngle(){
        return Math.toDegrees(Math.atan2(imaginary,real));
    }

    //void method to display the imaginary number
    public void displayRecForm(){
        if (imaginary > 0){
            System.out.printf("%.2f + %.2fi", real, imaginary);
        }
        else{
            System.out.printf("%.2f - %.2fi", real, Math.abs(imaginary));
        }
    }
}
