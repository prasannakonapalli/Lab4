import java.util.*;

public class SquareCube {
	public static void main(String[] args) {
		String continue1;
		Scanner scr = new Scanner(System.in);
		do {

			System.out.println("Enter an integer");
			int num = scr.nextInt();
			System.out.println("Number\t\t Squared\t cubed");
			System.out.println("=======\t\t=======\t\t=======");
			for (int i = 1; i <= num; i++) {
				int square = i * i;
				int cube = i * i * i;

				System.out.println(i + "\t\t" + square + "\t\t" + cube);
			}
			// challenge
			System.out.println();
			System.out.println();
			System.out.println("*****************************************");
			System.out.println("Challenge");
			System.out.println();
			for (int i = 1; i < num; i++) {
				System.out.print("    " + i + " ");

				// System.out.println("= ");
			}
			System.out.println();
			for (int i = 1; i < num; i++) {

				System.out.print("    = ");
			}
			System.out.println();
			for (int i = 1; i < num; i++) {
				System.out.print(i + " | ");
				for (int j = 1; j < num; j++) {

					System.out.print(" " + i * j + "   ");

				}
				System.out.println();
			}

			System.out.print("Continue y/n :");
			continue1 = scr.next();
			if (continue1.equalsIgnoreCase("n"))
				break;
		} while (continue1.equalsIgnoreCase("y") || continue1.equalsIgnoreCase("n"));
		// challenge
		scr.close();

	}
}
