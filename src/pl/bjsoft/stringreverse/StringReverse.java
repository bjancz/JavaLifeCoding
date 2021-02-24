package pl.bjsoft.stringreverse;

public class StringReverse {

	public static void main(String[] args) {

		String chain = "abcdefghijkl";
		StringBuilder builder = new StringBuilder();

		for (int i = chain.length() - 1; i >= 0; i--) {
			builder.append(chain.charAt(i));
		}
		System.out.println(builder.toString());
	}

}
