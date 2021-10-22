package a.multi.dim;

public class Cinema {

	private char[][] matrix;

	public Cinema(int rows, int seats) {
		matrix = new char[rows][seats];
		for (int row = 0; row < matrix.length; row++) {
			for (int seat = 0; seat < matrix[row].length; seat++) {
				matrix[row][seat] = 'O';
			}
		}
	}

	public boolean add(int row, int seat) {
		if (row >= 0 && row < matrix.length && seat >= 0 && seat < matrix[0].length) {
			if (matrix[row][seat] == 'O') {
				matrix[row][seat] = 'X';
				System.out.println("added");
				return true;
			} else {
				System.out.println("not added - seat taken");
				return false;
			}
		} else {
			System.out.println("not added - seat not exist");
			return false;
		}
	}

	public void display() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("=============================");
	}

	public static void main(String[] args) {
		Cinema c1 = new Cinema(3, 5);
		c1.display();
		
		System.out.println(c1.add(0, 0));
		System.out.println(c1.add(0, 0));
		System.out.println(c1.add(100, 0));
		c1.display();
	}

}
