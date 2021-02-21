import java.util.Scanner;

class RunMain {
    public static void main(String[] args) {
        System.out.println("Which functions are you going to run?\n " +
                "input c for counting the frequency\n " +
                "input r for throwing a dice\n " +
                "input g to play a game with me!");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (answer.equals("c")) {
            countFreq count = new countFreq();
            count.countingFreq();
        }
        if (answer.equals("r")) {
            throwDice throwing = new throwDice();
            int number = throwing.throwingDice();
            System.out.println("You rolled " + number + "!");
        }
        if (answer.equals("g")) {
            simpleGame game = new simpleGame();
            game.playingGame();
        }
        if (answer.equals("no")) {
            System.out.println("see you later!");
            System.exit(0);
        }
    }
}
