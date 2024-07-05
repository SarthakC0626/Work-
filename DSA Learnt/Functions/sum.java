package Functions;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        //NOTE Q. Take input od 2 number and print the sum continuosuly 10 times how to do it
            /*REVIEW -  access modifier (in oops), return type, name(){
                // body
                return statement;
                } 
                */
            System.out.println("Meet function call calci");
            sumexample();
    }       
       static void sumexample(){
        Scanner input = new Scanner (System.in);
        int n, q, sum;

        System.out.print("Enter the first number: ");
        n = input.nextInt();
        System.out.print("Enter the second number: ");
        q = input.nextInt();
        sum = n+q;
        System.err.println("The sum is: " + sum);
        
        }


    
}
