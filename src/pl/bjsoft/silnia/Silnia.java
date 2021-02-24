package pl.bjsoft.silnia;
/*
 * 5!=1⋅2⋅3⋅4⋅5=120
 */
public class Silnia {

	public static void main(String[] args) {

		System.out.println("Silnia wynosi " + obliczSilnie(6));
	}

	public static Integer obliczSilnie (int silnia) {
		Integer result=1;
		
		for (int i = 1; i <= silnia; i++) {
			result = result*i;
			
		}
		
		return result;
	}
}
