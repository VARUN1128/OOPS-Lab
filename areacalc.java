import java.util.Scanner;

class Area{
	void calcArea(int radius){
		System.out.println("Area of Circle :"+(radius*radius*3.14));
	}
	
	void calcArea(int length,int width){
		System.out.println("Area of Rectangle :"+(length*width));
		
	}
	
	void calcArea(int s1,int s2,int s3){
		int s = (s1+s2+s3)/2;
		float exp = s*(s-s1)*(s-s2)*(s-s3);
		System.out.println("Area of Triangle :"+Math.sqrt(exp));
	}
}


class areacalc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Area ar = new Area();
		System.out.print("Enter Radius of Circle :");
		ar.calcArea(sc.nextInt());
		
		System.out.println("Enter length and width of Rectangle :");
		ar.calcArea(sc.nextInt(),sc.nextInt());
		
		System.out.println("Enter Sides of Triangle :");
		ar.calcArea(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		
		
	}
}
