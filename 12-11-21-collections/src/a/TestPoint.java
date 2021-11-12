package a;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			Point[] points = new Point[5];

			for (int i = 0; i < points.length; i++) {
				System.out.println("point #" + (i + 1));
				while (true) {
					try {
						System.out.print("enter x: ");
						int x = sc.nextInt();
						System.out.print("enter y: ");
						int y = sc.nextInt();
						System.out.println();

						Point p = new Point(x, y);
						points[i] = p;
						break;
					} catch (PointXYException e) {
						System.out.println("error: " + e.getMessage());
					} catch (InputMismatchException e) {
						System.out.println("error: wrong input");
						sc.next(); // clear the wrong input from the scanner
					}

				}

			}

			System.out.println(Arrays.toString(points));

		}

		System.out.println("scanner closed");

	}

}
