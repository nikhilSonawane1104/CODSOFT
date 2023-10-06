

import java.util.*;

public class NumberGame{
    public static void main(String [] args)
    {
          Scanner sc=new Scanner(System.in);
          Random random=new Random();
     
           int maxAttempt=10;
           int rounds=0;
           int totalattempts=0;
           while(true)
           {
            rounds++;
            int random_num=random.nextInt(101);
            int attempts=0;
            System.out.println("round :" + rounds);
            

            while(attempts < maxAttempt)
            {
                System.out.println("Guess the number :");
                int Guess=sc.nextInt();
                attempts++;

                if(Guess==random_num)
                {
                    System.out.println("Great ! you guessed right number  in " + attempts + "attempts");
                    break;
                }
                else if(Guess < random_num)
                {
                    System.out.println("Too low , try again");
                    
                }
                else
                {
                    System.out.println("So high , try again");
                }
            }

            totalattempts+=attempts;
            System.out.println("Do you want to play again : Yes or No");
            String ans = sc.next().toLowerCase();
            if(ans.equals("no"))
            {
                break;
            }
            
           }


        

           System.out.println("Game over ! you played " + rounds + "rounds and total score is " + totalattempts + "attempts" );


        

       
    }
}