package a;

import java.util.Arrays;
import java.util.Scanner;

public class TestPoint2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			Point[] points = new Point[5];

			for (int i = 0; i < points.length; i++) {
				System.out.println("point #" + (i + 1));
				while (true) {
					try {
						System.out.print("enter x: ");
						int x = Integer.parseInt(sc.nextLine());
						System.out.print("enter y: ");
						int y = Integer.parseInt(sc.nextLine());
						System.out.println();

						Point p = new Point(x, y);
						points[i] = p;
						break;
					} catch (PointXYException e) {
						System.out.println("error: " + e.getMessage());
					} catch (NumberFormatException e) {
						System.out.println("error: wrong input");
//						sc.next(); // not necessary
					}

				}

			}

			System.out.println(Arrays.toString(points));

		}

		System.out.println("scanner closed");

	}

}
