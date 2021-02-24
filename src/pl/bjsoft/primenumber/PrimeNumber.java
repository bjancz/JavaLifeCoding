package pl.bjsoft.primenumber;
/**
 *  
 * Liczba pierwsza – liczba naturalna większa od 1, która ma dokładnie dwa dzielniki naturalne: jedynkę i siebie samą. Zbiór wszystkich liczb pierwszych oznacza się symbolem {\displaystyle \mathbb {P} .}{\displaystyle \mathbb {P} .}
	Wykaz początkowych liczb pierwszych:

2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 itd. (ciąg A000040 w OEIS).
W wykazie brak np. liczby 4, bowiem ma ona 3 dzielniki: 1, 2 i 4. Podobnie z liczbą 6, która ma 4 dzielniki: 1, 2, 3 i 6.

Liczby naturalne większe od 1, które nie są pierwsze, nazywa się liczbami złożonymi. Liczby 4 i 6 są więc przykładami liczb złożonych.

Z podanych definicji wynika, że liczby 0 i 1 nie są ani pierwsze, ani złożone[1].
 *
 */
public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int [] numbers = {3,5,7,11,13,18};
		
		for (int i : numbers) {
			System.out.println(i + " is prime: " + isPrime(i));
		}
	}
	
	
	public static boolean isPrime(int input) {
		if (input == 0 || input == 1)
			return false;
		if (input== 2 || input == 3)
			return true;
		if ((input * input -1) % 2 == 0)
			return true;
			else return false;
	
	}
	

}
