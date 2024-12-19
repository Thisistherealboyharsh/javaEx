import java.util.Random;
import java.util.Scanner;

public class StonePaperScissor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int botScore = 0;
        int playerScore = 0;
         String botChosen=""  ;

        System.out.println("********************   STONE PAPER SCISSOR   ********************");
        while(true) {
            int botInput = random.nextInt(3)+1;

            System.out.println("1.Stone\t 2.Paper \t3.Scissor \t9.Exit");
            System.out.print("select : ");
            int playerInput = input.nextInt();
            if (playerInput==9)
                break;


            switch (botInput) {
                case 1:
                     botChosen = "Stone";
                    break;
                case 2:
                    botChosen = "Paper";
                    break;
                case 3:
                    botChosen = "Scissor";
                    break;

            }

            //Let for computer bot 1 > Stone , 2 > Paper , 3 > Scissor
            // let for player       1 > Stone , 2 > Paper , 3 > Scissor
            System.out.println("Bot chosen :"+botChosen);

            if (botInput==playerInput)
                System.out.println("Match DRAW ! TRY AGAIN");
            else if ((playerInput == 1 && botInput == 3) || (playerInput == 2 && botInput == 1) || (playerInput == 3 && botInput == 2)) {
                System.out.println("YOU WON 1");
                playerScore +=1;
            }
            else if(playerInput<=0 | playerInput >3)
                System.out.println("Enter valid input");
            else {
                System.out.println("Better luck next time ");
                botScore +=1;
            }
            System.out.format("Score-->Bot: %s \t Your: %s ",botScore,playerScore);

            System.out.println("\n");
        }





    }
    }

//second code
//import java.util.Random;
//import java.util.Scanner;
//
//public class StonePaperScissor {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.println("********************   STONE PAPER SCISSOR   ********************");
//
//        while (true) {
//            // Display menu and read player input
//            System.out.println("1.Stone\t 2.Paper \t3.Scissor \t9.Exit");
//            System.out.print("Select: ");
//            int playerInput = input.nextInt();
//
//            // Exit condition
//            if (playerInput == 9) {
//                System.out.println("Exiting the game. Goodbye!");
//                break;
//            }
//
//            // Validate player input
//            if (playerInput < 1 || playerInput > 3) {
//                System.out.println("Enter a valid input (1-3 for Stone, Paper, Scissor)");
//                continue; // Prompt the player again without running the rest of the code
//            }
//
//            // Generate bot's choice (0 = Stone, 1 = Paper, 2 = Scissor)
//            int botInput = random.nextInt(3);
//            String botChosen = "";
//
//            // Assign bot's choice based on random number
//            switch (botInput) {
//                case 0:
//                    botChosen = "Stone";
//                    break;
//                case 1:
//                    botChosen = "Paper";
//                    break;
//                case 2:
//                    botChosen = "Scissor";
//                    break;
//            }
//
//            // Print bot's choice
//            System.out.println("Bot chose: " + botChosen);
//
//            // Game logic: Determine the winner
//            if (botInput == playerInput - 1) {
//                System.out.println("Match DRAW! TRY AGAIN");
//            } else if ((playerInput == 1 && botInput == 2) ||
//                    (playerInput == 2 && botInput == 0) ||
//                    (playerInput == 3 && botInput == 1)) {
//                System.out.println("YOU WON!");
//            } else {
//                System.out.println("Better luck next time.");
//            }
//        }
//
//        input.close();
//    }
//}
