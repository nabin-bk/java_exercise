import java.util.Scanner;
public class  Numberguess {
   int num;
   int num2;

   Numberguess(int num){
    this.num = num;


   }
   
   void check(){
       Scanner input = new Scanner(System.in);
       

     while(true){
        System.out.println("Enter the number");
        num2 = input.nextInt();

        if(num2>num){
            System.out.println("Your number " + num2 + " is greater");
        }

        else if (num2<num){
            System.out.println("Your number " + num2 + " is smaller");
        }
      
      else{
         System.out.println("Your guess is correct ");
        
      }
     }
   }

   public static void main(String[] aargs){
 
     Numberguessing  ng= new Numberguessing(7);
     ng.check();

   }
}
    
