import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String [] rps = {"Rock","Paper","Scissors"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        String playersMove;

        while (true)
        {
            System.out.println("Let's Play Rock Paper Scissors");
            System.out.println("Your turn!!");
            System.out.println("Rock Paper Scissors");
            playersMove=scanner.nextLine();
            if (playersMove.equalsIgnoreCase("Rock")||playersMove.equalsIgnoreCase("Paper")||playersMove.equalsIgnoreCase("Scissors"))
            {break;}
            System.out.println("Come on!" + playersMove + "That's not a valid move");
        }

        System.out.println("Computer's Move "+ computerMove);

        if(playersMove.equalsIgnoreCase(computerMove))
        {
            System.out.println("Result: That's a tie!!");
        }
        else if ( playersMove.equalsIgnoreCase("scissors")&(computerMove.equals("Paper")))
        {
            System.out.println("Result: Player Wins!!");
        } else if (playersMove.equalsIgnoreCase("rock")&(computerMove.equals("Scissors"))) {
            System.out.println("Result: Player Wins!!");
        } else if (playersMove.equalsIgnoreCase("paper")&(computerMove.equals("Rock"))) {
            System.out.println("Result: Player Wins!!");
        }
        else if ( playersMove.equalsIgnoreCase("Paper")&(computerMove.equals("Scissors")))
        {
            System.out.println("Result: Computer Wins!!");
        } else if (playersMove.equalsIgnoreCase("rock")&(computerMove.equals("Paper"))) {
            System.out.println("Result: Player Wins!!");
        } else if (playersMove.equalsIgnoreCase("Scissors")&(computerMove.equals("Rock"))) {
            System.out.println("Result: Player Wins!!");
        }
    }
}
