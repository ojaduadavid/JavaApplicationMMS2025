import java.util.Scanner;

public class StudentScoreTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] scores = new int[3][5];

        System.out.println("Enter scores for 3 students and 5 subjects");

        // Input scores
        for (int i = 0; i < scores.length; i++) {

            System.out.println("Student " + (i + 1));

            for (int j = 0; j < scores[i].length; j++) {

                System.out.print("Subject " + (j + 1) + ": ");
                scores[i][j] = input.nextInt();

            }
        }

        System.out.println("\nSCORE TABLE");

        // Display table
        for (int i = 0; i < scores.length; i++) {

            int total = 0;

            for (int j = 0; j < scores[i].length; j++) {

                System.out.print(scores[i][j] + "\t");
                total += scores[i][j];

            }

            System.out.println(" | Total = " + total);
        }

    }
}
