import java.util.Scanner;

public class Positivenegative{

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = input.nextInt();
           
        if (number<0){
            System.out.println("the number is negative");
           }
           
           else if(number==0){
            System.out.println("the number is neither positive nor negative");
               }

           else{
            
            System.out.println("the number is positive");

           }
           
           input.close();
         
    
    }

}

