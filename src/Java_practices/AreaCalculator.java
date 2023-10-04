package Java_practices;

public class AreaCalculator {
	public static double findArea(int r) {
		//Area of a circle=πr2
		double area=Math.PI*r*r;
		return area;
	}

	public static void main(String[] args) {
		for(int cm=1; cm<=4; cm++) {
			System.out.print("Radius="+cm+",");
			double area=findArea(cm);
			System.out.println("Area="+area);
		}
	}
}

