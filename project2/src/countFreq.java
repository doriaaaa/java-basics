import java.util.Random;
import java.util.Scanner;

public class countFreq {
    public void countingFreq() {
        Random dice = new Random();
        int freq[] = new int[7]; //0,1,2,3,4,5,6, total length=7
        System.out.println("input how many times that you want the dice to throw: ");
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        for (int i=0; i <times; i++) {
            int number = 1+dice.nextInt(6); //0-5
            ++freq[number]; //add frequency when the number hits
        }
        System.out.println("times\tfreq");
        for (int j=1; j<freq.length; j++) {
            System.out.println(j+ "\t\t" + freq[j]);
        }
    }
}