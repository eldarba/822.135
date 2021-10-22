package a.multi.dim;

public class Demo2Cinema {

	public static void main(String[] args) {
		int rows = 4;
		int seats = 6;
		
		char[][] cinema = new char[rows][seats];
		for (int row = 0; row < cinema.length; row++) {
			for (int seat = 0; seat < cinema[row].length; seat++) {
				cinema[row][seat] = 'O';
			}
		}
		
		cinema[0][2] = 'X'; // first row in the middle
		cinema[3][5] = 'X'; // last row right corner
		
		displayCinema(cinema);

	}

	private static void displayCinema(char[][] cinema) {
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				System.out.print(cinema[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
