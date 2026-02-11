package day_18;
import java.util.Scanner;
public class Array{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        int a[]=new int[5];
        System.out.println("Enter the number to be stored in Array");
         for(int i=0; i<a.length;i++){
            a[i]= input.nextInt();
         }
         System.out.println("The num stored in Array are:");
         for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
         }
    }
}
