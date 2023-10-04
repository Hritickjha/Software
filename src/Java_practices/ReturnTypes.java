package Java_practices;

public class ReturnTypes {
	/* The return type of the findArea method in this code is double.*/
	public static double  findArea(int radius) {
		/*Area of a circle=πr2.The value of π can be taken from the Math.PI Constant*/
		double area=Math.PI*radius*radius;
		return area;/*return the area which is of type double*/
	}
	public static void main(String args[]) {
	 double area = findArea(3);/*Assign the returned area of type double to variable 'area'*/
	 System.out.println("Area : "+area);
	}
}

