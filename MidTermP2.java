package ScrapProjects;

import java.util.Scanner;

public class MidTermP2 {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      boolean playagain = true;
      int count = 0;
      int win = 0;
      int loss = 0;
      String again = null;
      
      P2 player = new P2("Angie",0 ,0);
      
      System.out.printf("%s\n%d\n%d", player.getName(), player.getlossCount(), player.getwinCount());
      
      System.out.print("\nEnter name: ");
      String name = input.nextLine();
      player.setName(name);
      
      System.out.print("Hi "+ player.getName());
      
      
      //generate dice; assign odd = 1 and even = 2
      while (playagain) 
      {
         int dice;

         dice = 1 + (int) (Math.random() * 6);
         if (dice % 2 == 0) 
         {
            dice = 2;
         } else 
         {
            dice = 1;
         }
         //System.out.printf("Dice = %d ", dice);

         //user input
         System.out.println("\nEnter your guess(odd = 1; even = 2): ");
         int userguess;
         userguess = input.nextInt();
         //parse str to int to compare

         // comparing results
         System.out.printf("Dice = %d ", dice);

         if (userguess == dice) 
         {
            win++;
            player.setwinCount(win);
            
            System.out.println("Your guess is correct! ");
         } else 
         {
            loss++;
            player.setlossCount(loss);
            
            System.out.println("Your guess is incorrect! ");
         }
         System.out.printf("wins = %d", win);
         System.out.printf("\nlosses = %d", loss);
         input.nextLine();
         
         //ask user if play again
         System.out.print("\nPlay again?(y/n): ");
         again = input.nextLine();
         
         if (again.equals("n") || again.equals("N"))
         {
         playagain = false;
         }
      }
      System.out.println("Good bye "+ player.getName());
      System.out.print("Total wins = " + player.getwinCount());
      System.out.print("\nTotal loss = " + player.getlossCount());
   }
}

// Can you please provide the descrption and intended usage of the player class?

