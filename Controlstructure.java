import java.util.Scanner;

public class Controlstructure {
    public static void main(String[] args) {
        // int age=18;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the age");
        // int age=sc.nextInt(); 
        // if (age>=18) 
        //     System.out.println("eligible");
        // sc.close();
        //if else  biggest of two numbers
            Scanner sc=new Scanner(System.in);  
            System.out.println("Enter First number");
            int a=sc.nextInt();
            System.out.println("Enter second number");
            int b=sc.nextInt();
            if(a>b)
                System.out.println("First no is largest");
            else
                System.out.println("second no is largest");
   }

}