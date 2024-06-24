package KunalKhushwaha;

import java.util.Scanner;


public class loops {
    
    public static void main(String[] args) {
        //NOTE if only workd is the condition is true in it 
        Scanner input = new Scanner (System.in);
        System.out.println("If and else loop use to check correct number");
        int a = input.nextInt();
        if(a == 10){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        //NOTE while loop starts
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;

        }

        //NOTE for loop starts
        for(int toto = 1; toto != 5; toto++){
            System.out.println(toto);
        } 
    }
    
}
