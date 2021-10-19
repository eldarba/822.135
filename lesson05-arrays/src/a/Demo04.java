package a;

public class Demo04 {

	public static void main(String[] args) {
		
		Point[] points = new Point[10];
		
		for (int i = 0; i < points.length; i++) {
			int x = (int) (Math.random()*101);
			int y = (int) (Math.random()*101);
			points[i] = new Point(x, y);
			System.out.println("(" + points[i].getX() + ", " + points[i].getY() + ")");
		}
		

	}

}
