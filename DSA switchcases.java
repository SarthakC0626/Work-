import java.util.Scanner;  
public class switchcases {  
public static void main(String args[]){  
          Scanner input = new Scanner(System.in);  
          System.out.println("Enter name of Fruit:");
          
          String fruit = input.next();

           switch (fruit){
            case "Mango":
                System.out.println("King of the fruits");
                break;  

            case "Grapes":
                System.out.println("King of the fruits");
                break;

            case "Apple":
                System.out.println("Keeps the doctor away");
                break;

            default:
                System.out.println("Invalid Input");

           }          

        }  
}  
