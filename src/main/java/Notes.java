
class Notes {
	public static void main(String[] args) {
		
		//Converting data types
		//typecasting - converting between primitive types

		int num;
		num = 4;
		//int -> double
		System.out.println((double)num); //cannot alter the original
		System.out.println(num);
		System.out.println(num + 0.0);

		num = 8523;
		//int -> char
		System.out.println((char)num); //converts based on ASCII values

		//int -> boolean - can't convert to booleans
		// System.out.println((boolean)num);

		double num2 = 4.9;
		//double -> int
		System.out.println((int)num2); //any after the decimal is removed
		//this does not round

		num2 = 65.9;
		//double -> char
		System.out.println((char)num2); //use the whole number for the conversion

		//double -> boolean - doesn't exist

		char c;
		c = 'A';
		//char -> int
		System.out.println((int)c);

		//char -> double
		System.out.println((double)c);

		//char -> boolean - doesn't exist


		//parsing - coverting from a String to a primitive type

		String word = "34534";

		//int
		System.out.println(word + 5); //concatenation
		System.out.println(Integer.parseInt(word) + 5); //addition
		num = Integer.parseInt(word);

		//double
		System.out.println(word + 5); //concatenation
		System.out.println(Double.parseDouble(word) + 5); //addition
		num2 = Double.parseDouble(word);

		word = "TRue"; //is not case sensitive
		//boolean
		System.out.println(Boolean.parseBoolean(word) && false); //addition
		boolean flag = Boolean.parseBoolean(word);
	}
}
