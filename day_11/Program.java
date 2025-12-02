package day_11;
import java.util.Scanner;
public class Program{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the length ");
        double length =input.nextDouble();

        System.out.println("Enter the breadth ");
        double breadth =input.nextDouble();

 Rectangle rectangle =new Rectangle(length,breadth);
 rectangle.areaOfRectangle();
 rectangle.perimeterOfRectangle();

    }
}



