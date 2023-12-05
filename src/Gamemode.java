import java.util.Scanner;
public class Gamemode {
    private boolean bot;
    public Gamemode() {
        bot = false;
    }
    public Gamemode(boolean bot) {
        this.bot = true;
    }
    public String playTurn() {
        String choice = " ";
        if (!bot) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Choose (A1/A2/A3/B1/B2/B3/C1/C2/C3): ");
            choice = sc.nextLine();
        } else {
            choice = convert((int) (Math.random() * 9) + 1);
        }
        return choice;
    }
    private String convert(int number) {
        if (number == 1) {
            return "A1";
        } else if (number == 2) {
            return "A2";
        } else if (number == 3) {
            return "A3";
        } else if (number == 4) {
            return "B1";
        } else if (number == 5) {
            return "B2";
        } else if (number == 6) {
            return "B3";
        } else if (number == 7) {
            return "C1";
        } else if (number == 8) {
            return "C2";
        } else {
            return "C3";
        }
    }
}
