import java.util.Scanner;

public class simpleGame {
    private int turn_Player_total = 0;
    private int turn_Computer_total = 0;
    private int score_Player_total = 0;
    private int score_Computer_total = 0;
    public String input;
    public Scanner scan;
    public void playingGame() {
        System.out.println("--------------\nGAME OF PIG\n--------------");
        System.out.println("Throwing 2,3,4,5,6 will help you score marks and get an extra chance to throw the dice again,\n" +
                " while throwing 1 will score 0 marks\n" +
                "you can either pick rolling the dice or hold the current marks\n" +
                "player who reached 100 marks first will be the winner");
        System.out.println("Press 'r' to roll a dice\nPress 'h' to hold the marks");
        scan = new Scanner(System.in);
        Human();
    }
    public void Human() {
        input = scan.nextLine();
        turn_Player_total = 0;
        while (score_Player_total < 100 && score_Computer_total < 100) {
            while (input.equals("r")) {
                throwDice throwing = new throwDice();
                int diceValue = throwing.throwingDice();
                if (diceValue != 1) {
                    turn_Player_total += diceValue;
                    System.out.println("Your current mark is " + turn_Player_total +
                            " and your total score is " + score_Player_total);
                    System.out.println("Press 'r' to roll a dice\nPress 'h' to hold the marks");
                    input = scan.nextLine();
                } else if (diceValue == 1) {
                    turn_Player_total = 0;
                    System.out.println("Your current score is " + turn_Player_total +
                            " and your total score is " + score_Player_total);
                    System.out.println("It's computer's turn now");
                    Computer();
                }
            }
            if (input.equals("h")) {
                score_Player_total += turn_Player_total;
                System.out.println("Your total score is " + score_Player_total);
                check();
                Computer();
            }
        }
    }
    public void Computer(){
        turn_Computer_total = 0;
        for (int i=0; i<5; i++) {
            throwDice throwing = new throwDice();
            int diceValue = throwing.throwingDice();
            if (diceValue!=1) {
                turn_Computer_total += diceValue;
            }
            else if (diceValue==1) {
                turn_Computer_total = 0;
                break;
            }
        }
        score_Computer_total += turn_Computer_total;
        System.out.println("Computer's total score is "+score_Computer_total +
                " and your total score is " + score_Player_total);
        check();
        System.out.println("It's your turn now");
        System.out.println("Press 'r' to roll a dice\nPress 'h' to hold the marks");
        Human();
    }
    public void check() {
        if (score_Player_total >= 100) {
            System.out.println("You win this game, congratulations!");
            System.exit(0);
        } else if (score_Computer_total >= 100) {
            System.out.println("Computer wins the game, so sad!");
            System.exit(0);
        }
        else return;
    }
}
