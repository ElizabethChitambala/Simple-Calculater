import java.util.Scanner;
public class SimpleCalculator{
    public static void main(String[]args){

Scanner box =new Scanner(System.in);

//Collect the First && the Second number
System.out.println("Enter first number");
Double num1=box.nextDouble();
System.out.println("Enter second number");
Double num2=box.nextDouble();

Double sum=num1 + num2;
Double difference=num1 - num2;
Double product=num1 * num2;
Double quotient=num1 /num2;

    //Dsplay the Sum,Difference,Product && Quotient
    System.out.println("\nSum is: "+sum);
     System.out.println("Difference is: "+difference);
     System.out.println("Product is: "+product);
     System.out.println("Quotient is: "+quotient);


}

    }
        // Close Scanner
    
