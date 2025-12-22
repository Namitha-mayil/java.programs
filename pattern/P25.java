package pattrens;
public class P25 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int space = 1; space <= rows - i; space++)
                System.out.print(" ");

            for (char ch = (char) ('E' - i); ch >= 'A'; ch--)
                System.out.print(ch);

            for (char ch = 'B'; ch <= (char) ('E' - i); ch++)
                System.out.print(ch);

            System.out.println();
        }
    }
}
