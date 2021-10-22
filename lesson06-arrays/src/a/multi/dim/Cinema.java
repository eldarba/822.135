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
	
	public void display() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Cinema c = new Cinema(3, 5);
		c.display();
	}

}
