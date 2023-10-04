package Java_practices;
public class SwitchStatement2 {
	public static void main(String[] args) {
		int day = 12;
		switch(day){
			case 1:System.out.println("mon");break;
			case 2:System.out.println("Tue");break;
			case 3:System.out.println("wed");break;
			case 4:System.out.println("Thu");break;
			case 5:System.out.println("fri");break;
			case 6:System.out.println("sat");break;
			case 7:System.out.println("sun");break;
			default:System.out.println("Not a day");
		/* Execute default as no case satisfies the value of variable day*/

		}
	}
}