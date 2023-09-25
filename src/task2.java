import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            String [] moves = {"Rock", "Paper", "Scissors"};
            String Computer_Move = moves[new Random().nextInt(moves.length)];
		
			System.out.println("Computer did his choise.");
			System.out.println();
			System.out.println("Now it's your turn to choose.");

            String User_Move;
            while(true)
            {
                System.out.println("Please choose your move from these available moves : 'Rock' 'Paper' 'Scissors' ");
                System.out.println("Enter the move you chose : ");
				User_Move = scanner.nextLine();

                if(User_Move.equals("Rock") || User_Move.equals("Paper") || User_Move.equals("Scissors"))
                {
					System.out.println();
					break;
                    
				}
                System.out.println();
				System.out.println("Invalid Move!!");
				System.out.println("Please enter the move from the available moves only!");
				System.out.println();
            }

            System.out.println("Computer chose : " + Computer_Move);

            if(User_Move.equals(Computer_Move))
            {
				System.out.println("Its a tie!");
			}

            else if(User_Move.equals("Rock"))
            {
				if(Computer_Move.equals("Paper")) 
                {
					System.out.println("Computer won!");
					System.out.println("Better luck next time!");
				} 
				else if(Computer_Move.equals("Scissors")) 
                {
					System.out.println("You won!");
					System.out.println("Congratulations!");
				}
			}
            else if(User_Move.equals("Paper")) 
            {
			
				if(Computer_Move.equals("Rock")) 
                {
					System.out.println("You won!");
					System.out.println("Congratulations!");
				} 
				else if(Computer_Move.equals("Scissors")) 
                {
					System.out.println("Computer won!");
					System.out.println("Better luck next time!");
				}
			}
            else if(User_Move.equals("Scissors")) 
            {
			
				if(Computer_Move.equals("Paper")) 
                {
					System.out.println("You won!");
					System.out.println("Congratulations!");
				} 
				else if(Computer_Move.equals("Rock")) 
                {
					System.out.println("Computer won!");
					System.out.println("Better luck next time!");
				}
			}
            
            System.out.println();
			String Play_Again;
			System.out.println("Do you want to play again? ");
            while(true) 
            {
				
				System.out.println("Type 'yes' or 'no' ");
				Play_Again = scanner.nextLine();
				Play_Again = Play_Again.toLowerCase();
				if(Play_Again.equals("yes") || Play_Again.equals("no")) 
                {
					System.out.println();
					System.out.println("*****************************************************************************");
					System.out.println();
					break;
				}
				System.out.println();
				System.out.println("Invalid Input");
				System.out.println();
			}
            if(Play_Again.equals("no")) 
            {
				break;
			}


        }

    }
}
