package jv;
abstract class shape{
	abstract void area();
	abstract void volume();
	double pi=3.14;
	double r=3.45;
	double h=6.45;
	
}
class shpaer extends shape{
	void area() {
		double are=4*pi*r*r;
		System.out.println("Area of shpaer:"+are);
		
		
		
	}
	
	void volume() {
		double volum=4/3*pi*r*r*r;
		System.out.println("Volume of shpaer: "+volum);
	}
}
class cylinder extends shape{
	void area() {
		double are1=2*pi*r*h+2*pi*r*r;
		System.out.println("Area of shpaer:"+are1);
		
		
	}
	void volume() {
		double volum1=pi*r*r*h;
		System.out.println("Volume of shpaer: "+volum1);
		
	}
}
public class AbstractAreaandVolume {

	public static void main(String[] args) {
		shpaer sp=new shpaer();
		sp.area();
		sp.volume();
		cylinder cy=new cylinder();
		cy.area();
		cy.volume();
		
		

	}

}
