import java.util.Scanner;
public class Hello{
   
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
    int num1;
    int num2;
    int num3;

    System.out.println("Enter first your number");
    num1 = input.nextInt();

     System.out.println("Enter second your number");
     num2 = input.nextInt();

      System.out.println("Enter third your number");
      num3= input.nextInt();


    int sum=num1+num2+num3;
    System.out.println("Your number is " + sum);

 }
    
}