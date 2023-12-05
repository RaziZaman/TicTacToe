public class Display {
    private static int num;
    public Display() {
        num = 42;
    }
    public static void display(String A1, String B1, String C1, String A2, String B2, String C2, String A3, String B3, String C3) {
        for (int i = 0; i <= num; i++) {
            System.out.print("\n");
        }
        System.out.println("    A   |   B   |   C   ");
        System.out.println("1   " + A1 + "   |   " + B1 + "   |   " + C1 + "   ");
        System.out.println("------------------------");
        System.out.println("2   " + A2 + "   |   " + B2 + "   |   " + C2 + "   ");
        System.out.println("------------------------");
        System.out.println("3   " + A3 + "   |   " + B3 + "   |   " + C3 + "   ");
    }
    public static boolean winCheck(String A1, String B1, String C1, String A2, String B2, String C2, String A3, String B3, String C3) {
        if (A1.equals(B1) && B1.equals(C1) && (B1.equals("X") || B1.equals("O")) || A2.equals(B2) && B2.equals(C2) && (B2.equals("X") || B2.equals("O")) || A3.equals(B3) && B3.equals(C3) && (B3.equals("X") || B3.equals("O"))) {
            return true;
        } else return (A1.equals(A2) && A2.equals(A3) && (A2.equals("X") || A2.equals("O")) || B1.equals(B2) && B2.equals(B3) && (B2.equals("X") || B2.equals("O")) || C1.equals(C2) && C2.equals(C3) && (C2.equals("X") || C2.equals("O")));
    }
    public static boolean winCheck(String A1, String C1, String B2, String A3, String C3) {
        return A1.equals(B2) && B2.equals(C3) && (B2.equals("X") || B2.equals("O")) || C1.equals(B2) && B2.equals(A3) && (B2.equals("X") || B2.equals("O"));
    }
}
