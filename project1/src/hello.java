import java.util.Scanner;

class hello {
    public static void main (String[] args) {
        System.out.println("What is your bf name? ");
        Scanner scanName = new Scanner(System.in);
        String temp = scanName.nextLine();
        name nameObject = new name();
        nameObject.setBoyName(temp);
        nameObject.nickname();
    }
}
