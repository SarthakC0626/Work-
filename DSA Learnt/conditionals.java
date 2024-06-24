package KunalKhushwaha;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        // System.out.println("what is your salary: ");
        // int Salary = input.nextInt();

        // if ( Salary < 20000){
        //     System.out.println(Salary+2000);
        // }
        // if (Salary == 20000){
        //     System.out.println(Salary);
        // }
        // else{
        //     System.out.println(Salary-2000);
        // }

        //System.out.println("Program to print loops");
        /*SECTION Syntax for loops
        for (intialisation; condition; increment&decrement){
            //body
            }
            */
        //NOTE Q. Print 1,2,3,4,5 

            // int a = input.nextInt();
            // for(int num=a; num <=10; num+=1 ){
            //     System.out.println(num);
            // }

        /*SECTION syntax of While loop
          While (condition){
            body
          }
        */
            // System.out.println("Type the value n: ");
            // int num = input.nextInt();
            // while (num<= 10){
            //     System.out.println(num);
            //     num +=1;           
            // }
        /*NOTE when to use for and while
        use while when u dont know how many times the loop gonna execute
        and for for the condition opposite*/
        
        /*SECTION do while loop syntax*/
        // int s = input.nextInt();
        // do {
        //     System.out.println(s);
        //     s++;
        // } while (s <= 10); //ANCHOR - it will execute atleast once no matter what

        //REVIEW - Question solved - Kunal Kushwaha
        // //Q1. find the largest number out of the 3 numbers
        // System.out.println("Enter the number a:");
        // int a = input.nextInt();
        // System.out.println("Enter the number b:");
        // int b = input.nextInt();
        // System.out.println("Enter the number c:");
        // int c = input.nextInt();
        
        // if (a>b){
        //     if (a>c);{
        //         System.out.println("a is the largest");
        //     }
        // }
        // else if (b>c){
        //     if (b>a){
        //         System.out.println("b is the largest ");
        //     }
        // }
        // else if(a == c){
        //     if (b == c){
        //         System.out.println("all are equal");
        //     }

        // }
        
        // else{
        //     System.out.println("c is the largest");
        // }
        // //ANCHOR - can also be done using math.max check

        // //Q2 .Check if the letter is uppercase or lower.
        
        // char ch = input.next().trim().charAt(0);
        
        // if (ch>= 'a' && ch <= 'z'){
        //     //NOTE - && is used when we need both condition to be true to execute the code
        //     System.out.println("The letter is lowercase");
        // }
        // else{
        //     System.out.println("The letter is uppercase"); 
        // }

        // //Q3. findthe nth Fibonnaci Numbers

        // int n = input.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2 ;

        // while (count<=n){
        //     int temp = b;
        //     b = b+a;
        //     a = temp;
        //     count++;
        // }
        // System.out.println(b);

        // //Q4. Counting Occurrences
        // //n  =  1 3 8 5 7 5 7 8 7 9 
        // //ans of how many times 7 is recurring = 3
        // int n = input.nextInt();
        // int count = 0;
        // while (n > 0) {
        //     int rem = n % 10;
        //     if (rem == 5) {
        //         count++;
        //     }
        //     n = n / 10;
            
        // }
        // System.out.println(count);


        //Q5. n = number now print the reverse of the number
        int n = input.nextInt();
        int ans = 0;
        while (n>0){
            int rem = n % 10;
            n /= 10;

            ans = ans*10+rem;
        }
        System.out.println(ans);


    }  
}
