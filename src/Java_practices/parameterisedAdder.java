package Java_practices;

public class parameterisedAdder {
/* x and y are the parameters of method 'add'*/
	
	public static void add(int x, int y ) {
		int z=x+y;
		System.out.println(x+"+"+y+" ="+z);
	}

	public static void main(String[] args) {
		// add(x,y);
		add(55,10);//pass 55 and 10 to add
		add(35,25);//pass 55 and 10 to add
		add(90,61);//pass 55 and 10 to add
	}

}

