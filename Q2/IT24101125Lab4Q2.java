import java.util.Scanner;

public class IT24101125Lab4Q2
  { 
    public static void main(String[]args)
      {
          Scanner input  = new Scanner(System.in);

          double examMarks;
          double labMarks;
          double examPercentage;
          double labPercentage = 0;
          double finalMarks;

          System.out.print("Please enter exam marks (out of 100):");
          examMarks = input.nextDouble();
          if(examMarks>100)
          {
           System.out.println("invalid input for exam marks. Terminating program");
          }

          System.out.print("Please enter lab submission marks (out of 100):");
          labMarks = input.nextDouble();
          if (labMarks>100)
          {
           System.out.println("invalid input for lab submission marks. Terminating program");
          }

          System.out.print("Please enter the percentage given for the exam:");
          examPercentage = input.nextDouble();
          if (examPercentage>100)
          {
           System.out.println("invalid input for exam percentage. Terminating program");
          }

          System.out.print("Please enter the percentage given for the lab submission:");
          labPercentage = input.nextDouble();
          if (labPercentage>100)
          {
           System.out.println("invalid input for lab submission percentage. Terminating program");
          }

          if (examPercentage + labPercentage !=100)
          {
           System.out.println("The percentage must add up 100. Terminating program");
          }

          finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
          System.out.printf("The final marks is:" + finalMarks);
          
       }
  }  