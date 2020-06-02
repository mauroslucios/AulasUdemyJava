package aulas.udemy.java.repeticao;

public class FormatString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ bc lmnop ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace("a", "10");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("String original:-"+original+ "-");
		System.out.println("String modificada com toLowercase(): "+s01);
		System.out.println("String modificada com toUpperCase(): "+s02);
		System.out.println("String modificada com trim():-"+s03+ "-");
		System.out.println("String modificada com substring(): "+s04);
		System.out.println("String modificada com substring(2,9): "+s05);
		System.out.println("String modificada com replace(\"a\",\"10\"): "+s06);
		System.out.println("IndexOf 'bc': "+ i);
		System.out.println("LaatIndexOf 'bc': "+ j);
		
	}
}
