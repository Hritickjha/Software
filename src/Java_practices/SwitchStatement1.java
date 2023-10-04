package Java_practices;
public class SwitchStatement1 {
	public static void main(String args[]) {
		int day=4;
		switch(day) {
		case 1:System.out.println("Mon");
		case 2:System.out.println("Tue");
		case 3:System.out.println("wed");
		case 4:System.out.println("Thu");
		case 5:System.out.println("Fri");
		case 6:System.out.println("sat");break;
		/* All cases from case 4 will be executed until a break statement is found.Even if the value of the below cases are not equal to the value of variable'day'*/
		case 7:System.out.println("sun");
		default:System.out.println("Not a day");
		}
	}
}
