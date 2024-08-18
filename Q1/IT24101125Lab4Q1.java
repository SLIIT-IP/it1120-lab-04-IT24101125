import java.util.Scanner;

public class IT24101125Lab4Q1
 {
    public static void main(String[]args)  
      {
          Scanner input = new Scanner(System.in);
  
          double number;
       
          System.out.print("Enter the Number:");
          number = input.nextDouble();

          if(number<0)
          {

          System.out.print("The Number is: Negative");
          number = input.nextDouble();
          } 
    
          else if (number>0)
          {
         
          System.out.print("The Number is: Positive");
          number = input.nextDouble();
          }

          else
          {

          System.out.print("The Number is Zero");
          number = input.nextDouble();
          }
       }
  }