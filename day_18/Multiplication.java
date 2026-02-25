import java.util.Scanner;
class Multiplication{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] a= new int[2][3];
        int [][] b= new int [3][4];
        int [][] multiply=new int [2][4];
        System.out.println("Enter the number for array 1:");
        for(int i=0; i<2; i++){
           for(int j=0; j<2; j++){
               System.out.print("a["+i+"]["+j+"]:");
               a[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter the number for array 2:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2;j++){
                System.out.print("b["+i+"]["+j+"]:");
                b[i][j]=input.nextInt();
            }
        }
        
        System.out.println("The multiply of array");
        for(int i=0; i<2; i++){
           for(int j=0; j<2; j++){
               multiply[i][j]=a[i][j]*b[i][j];
               System.out.print(multiply[i][j]);
            }
            System.out.println();
        }

        
    }
}