import java.util.Scanner;
public class Logic {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        String gm = "";
        String A1 = " ";
        String A2 = " ";
        String A3 = " ";
        String B1 = " ";
        String B2 = " ";
        String B3 = " ";
        String C1 = " ";
        String C2 = " ";
        String C3 = " ";
        while (!gm.equalsIgnoreCase("singleplayer") && !gm.equalsIgnoreCase("multiplayer")) {
            System.out.print("Choose Singleplayer/Multiplayer: ");
            gm = sc.nextLine();
            if (gm.equalsIgnoreCase("singleplayer")) {
                Gamemode player = new Gamemode();
                Gamemode bot = new Gamemode(true);
                int z = 1;
                while (z != 0) {
                    int x = 0;
                    if (Display.winCheck(A1,B1,C1,A2,B2,C2,A3,B3,C3) || Display.winCheck(A1,C1,B2,A3,C3)) {
                        z = 0;
                    }
                    while (x == 0 && z != 0) {
                        Display.display(A1,B1,C1,A2,B2,C2,A3,B3,C3);
                        String choice = player.playTurn();
                        if (choice.equals("A1") && A1.equals(" ")) {
                            A1 = "X";
                            x = 1;
                        } else if (choice.equals("A2") && A2.equals(" ")) {
                            A2 = "X";
                            x = 1;
                        } else if (choice.equals("A3") && A3.equals(" ")) {
                            A3 = "X";
                            x = 1;
                        } else if (choice.equals("B1") && B1.equals(" ")) {
                            B1 = "X";
                            x = 1;
                        } else if (choice.equals("B2") && B2.equals(" ")) {
                            B2 = "X";
                            x = 1;
                        } else if (choice.equals("B3") && B3.equals(" ")) {
                            B3 = "X";
                            x = 1;
                        } else if (choice.equals("C1") && C1.equals(" ")) {
                            C1 = "X";
                            x = 1;
                        } else if (choice.equals("C2") && C2.equals(" ")) {
                            C2 = "X";
                            x = 1;
                        } else if (choice.equals("C3") && C3.equals(" ")) {
                            C3 = "X";
                            x = 1;
                        } else {
                            System.out.println("That spot is occupied, try again");
                        }
                    }
                    int y = 0;
                    if (Display.winCheck(A1,B1,C1,A2,B2,C2,A3,B3,C3) || Display.winCheck(A1,C1,B2,A3,C3)) {
                        z = 0;
                    }
                    while (y == 0 && z != 0) {
                        String choice = bot.playTurn();
                        if (choice.equals("A1") && A1.equals(" ")) {
                            A1 = "O";
                            y = 1;
                        } else if (choice.equals("A2") && A2.equals(" ")) {
                            A2 = "O";
                            y = 1;
                        } else if (choice.equals("A3") && A3.equals(" ")) {
                            A3 = "O";
                            y = 1;
                        } else if (choice.equals("B1") && B1.equals(" ")) {
                            B1 = "O";
                            y = 1;
                        } else if (choice.equals("B2") && B2.equals(" ")) {
                            B2 = "O";
                            y = 1;
                        } else if (choice.equals("B3") && B3.equals(" ")) {
                            B3 = "O";
                            y = 1;
                        } else if (choice.equals("C1") && C1.equals(" ")) {
                            C1 = "O";
                            y = 1;
                        } else if (choice.equals("C2") && C2.equals(" ")) {
                            C2 = "O";
                            y = 1;
                        } else if (choice.equals("C3") && C3.equals(" ")) {
                            C3 = "O";
                            y = 1;
                        }
                    }
                }
                Display.display(A1,B1,C1,A2,B2,C2,A3,B3,C3);
            } else if (gm.equalsIgnoreCase("multiplayer")) {
                Gamemode player = new Gamemode();
                int z = 1;
                if (Display.winCheck(A1,B1,C1,A2,B2,C2,A3,B3,C3) || Display.winCheck(A1,C1,B2,A3,C3)) {
                    z = 0;
                }
                while (z != 0) {
                    int x = 0;
                    Display.display(A1,B1,C1,A2,B2,C2,A3,B3,C3);
                    while (x == 0 && z != 0) {
                        String choice = player.playTurn();
                        if (choice.equals("A1") && A1.equals(" ")) {
                            A1 = "X";
                            x = 1;
                        } else if (choice.equals("A2") && A2.equals(" ")) {
                            A2 = "X";
                            x = 1;
                        } else if (choice.equals("A3") && A3.equals(" ")) {
                            A3 = "X";
                            x = 1;
                        } else if (choice.equals("B1") && B1.equals(" ")) {
                            B1 = "X";
                            x = 1;
                        } else if (choice.equals("B2") && B2.equals(" ")) {
                            B2 = "X";
                            x = 1;
                        } else if (choice.equals("B3") && B3.equals(" ")) {
                            B3 = "X";
                            x = 1;
                        } else if (choice.equals("C1") && C1.equals(" ")) {
                            C1 = "X";
                            x = 1;
                        } else if (choice.equals("C2") && C2.equals(" ")) {
                            C2 = "X";
                            x = 1;
                        } else if (choice.equals("C3") && C3.equals(" ")) {
                            C3 = "X";
                            x = 1;
                        } else {
                            System.out.println("That spot is occupied, try again");
                        }
                        Display.display(A1,B1,C1,A2,B2,C2,A3,B3,C3);
                    }
                    int y = 0;
                    if (Display.winCheck(A1,B1,C1,A2,B2,C2,A3,B3,C3) || Display.winCheck(A1,C1,B2,A3,C3)) {
                        z = 0;
                    }
                    while (y == 0 && z != 0) {
                        String choice = player.playTurn();
                        if (choice.equals("A1") && A1.equals(" ")) {
                            A1 = "O";
                            y = 1;
                        } else if (choice.equals("A2") && A2.equals(" ")) {
                            A2 = "O";
                            y = 1;
                        } else if (choice.equals("A3") && A3.equals(" ")) {
                            A3 = "O";
                            y = 1;
                        } else if (choice.equals("B1") && B1.equals(" ")) {
                            B1 = "O";
                            y = 1;
                        } else if (choice.equals("B2") && B2.equals(" ")) {
                            B2 = "O";
                            y = 1;
                        } else if (choice.equals("B3") && B3.equals(" ")) {
                            B3 = "O";
                            y = 1;
                        } else if (choice.equals("C1") && C1.equals(" ")) {
                            C1 = "O";
                            y = 1;
                        } else if (choice.equals("C2") && C2.equals(" ")) {
                            C2 = "O";
                            y = 1;
                        } else if (choice.equals("C3") && C3.equals(" ")) {
                            C3 = "O";
                            y = 1;
                        } else {
                            System.out.println("That spot is occupied, try again");
                        }
                        Display.display(A1,B1,C1,A2,B2,C2,A3,B3,C3);
                    }
                }
                Display.display(A1,B1,C1,A2,B2,C2,A3,B3,C3);
            } else {
                System.out.println("Please enter the gamemode again.");
            }
        }
    }
}
