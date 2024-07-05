// calculator based on the access modifiers and other stuff learned in the files above
// takes input for everything from the user and gives the result for basic arithematic oberations
// can be fine tuned to make use of switch cases to reduce the need for if else again and again
package Functions;
import java.util.Scanner;

public class whatif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number 1");
        int a = sc.nextInt();
        System.out.println("Write number 2");
        int b = sc.nextInt();
        
        System.out.println("Enter operation (sum, diff, mult, div): ");
        String ans = sc.next();
        
        // Perform operation based on user choice
        if (ans.equals("sum")) {
            System.out.println("Sum is: " + sum3(a, b));
        }
        else if(ans.equals("diff")){    
            System.out.println("Difference is: " + diff3(a, b));
        }
         else if (ans.equals("div")) {
            System.out.println("Division is: " + div3(a,b));
        }
        else if (ans.equals("mult")){
            System.out.println("Multiplication is: "+ mul3(a,b) );
        }
        else{
            System.out.println("Learn to read" + "Basic arithematic symbols only!!");
        }
        
        // Close the scanner
        sc.close();
    }
    
    static int sum3(int a, int b) {
        System.out.println("The sum is: ");
        int sum = a+b;
        return sum;

    }
    static int diff3(int a, int b){
        int diff = a-b;
        return diff;
    }
    static int div3(int a, int b){
        int div = a/b;
        return div;
    }
    static int mul3(int a, int b){
        int mul = a*b;
        return mul;
    }
}
