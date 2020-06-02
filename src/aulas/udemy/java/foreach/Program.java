package aulas.udemy.java.foreach;

public class Program {
	
	public static void main(String[] args) {
		String[] vect = new String[] {"Everton","Ethelin","Evelin"};
		
		for(int i =0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("####################");
		for(String names : vect) {
			System.out.println(names);
		}
	}
}
