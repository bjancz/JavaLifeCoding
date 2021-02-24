package pl.bjsoft.gcd;

/*
 * Najwiekszy wspolny dzielnik
 */
public class GCD {

	public static void main(String[] args) {

		System.out.println(findGCD(54, 24));
		
	}

	public static int findGCD (int number1, int number2) {
		
		if (number2 == 0) {
			return number1;
		}
		
		return findGCD(number2, number1%number2);
	}

}
