package Chapter03;

import java.util.Scanner;

/**
 * Program to play rock paper scissors
 *
 * @author Nicholas Philip
 */
public class C3_3 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computer = (int) (Math.random() * 3);

        System.out.print("Scissors is 0, rock is 1, and paper is 2: ");
        int user = input.nextInt();
        System.out.print("The computer is ");
        switch (computer) {
            case 0:
                System.out.print("scissors. ");
                break;
            case 1:
                System.out.print("rock. ");
                break;
            case 2:
                System.out.print(" "
                        + "paper. ");
        }
        System.out.print("You are ");
        switch (user) {
            case 0:
                System.out.print("scissors");
                break;
            case 1:
                System.out.print("rock");
                break;
            case 2:
                System.out.print("paper");
        }
        if (computer == user) {
            System.out.print(" too. it is a draw ");
        } else {
            boolean win = (user == 1 && computer == 0)
                    || (user == 1 && computer == 0)
                    || (user == 2 && computer == 1);
            if (win) {
                System.out.print(". You won");
            } else {
                System.out.print(". You lose");
            }
        }
    }

}
