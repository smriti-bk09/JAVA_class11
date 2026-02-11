package day_19;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("enter value to make a listin array");
        String n[]= new String [10]; 

 for (int i = 0; i < n.length; i++) {
            n[i] = input.nextLine(); 
 }  for (int i=1; i<n.length ; i++){
            System.out.println(n[i]); 
        }
    }
}
