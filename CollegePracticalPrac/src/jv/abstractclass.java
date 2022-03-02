package jv;
abstract class shape1{
	abstract void area();
	abstract void volume();
	double pi=3.14;
	double r=3.45;
	double h=6.45;
	
	
}
class shpaer1 extends shape1{

	
	void area() {
		double area1=4*pi*r*r;
		System.out.println("area of shpaer="+area1);
		
	}

	
	void volume() {
		double volume1=4/3*pi*r*r*r;
		System.out.println("valume of shpaer="+volume1);
		
		
		
	}
	
}
class cone extends shape1{

	void area() {
		double area1=pi*r*(r+Math.sqrt(h*h + r*r));
		System.out.println("area of cone="+area1);
		
	}

	
	void volume() {
		double volume1=pi*r*r*h/3;
		System.out.println("volume  of cone="+volume1);
		
		
		
	}
	
}

public class abstractclass {

	public static void main(String[] args) {
		shpaer1 sp=new shpaer1();
		sp.area();
		sp.volume();
		cone cn=new cone();
		cn.area();
		cn.volume();

	}

}
