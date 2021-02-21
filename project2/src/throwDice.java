import java.util.Random;

public class throwDice {
    public int throwingDice() {
        Random dice = new Random();
        System.out.println("Throwing a dice...");
        int number = 1+dice.nextInt(6);
        System.out.println("You rolled " + number + "!");
        return number;
//        while (number == 6) {
//            System.out.println("You have an extra chance to throw again! ");
//            number = 1 + dice.nextInt(6);
//            System.out.println("You rolled " + number + "!");
//        }

    }
}
