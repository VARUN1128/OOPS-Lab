import java.util.Scanner;

abstract class Shape{
	abstract void numberofSides();
}

class Rectangle extends Shape{
	void numberofSides(){
		System.out.println("Number of sides of Rectangle are 4");
	}
}

class Triangle extends Shape{
	void numberofSides(){
		System.out.println("Number of sides of Triangle are 3");
	}
}

class Hexagon extends Shape{
	void numberofSides(){
		System.out.println("Number of sides of Hexagon are 6");
	}
}


class shapeStuff{
	public static void main(String args[]){
		
		Rectangle rect = new Rectangle();
		rect.numberofSides();
		Triangle tri = new Triangle();
		tri.numberofSides();
		Hexagon hex = new Hexagon();
		hex.numberofSides();
	}
}
