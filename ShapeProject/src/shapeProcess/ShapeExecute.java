package shapeProcess;
import shapePack.*;

public class ShapeExecute {
	
	public static void main(String args[]) {
		
		Square square = new Square();
		SemiCircle semicircle = new SemiCircle();
		
		square.printSquare();
		square.printRectangle();
		square.printShape();
		
		System.out.println("-------------");
		
		semicircle.printShape();
		semicircle.printCircle();
		semicircle.printSemiCircle();
		
	}
	
	

}
