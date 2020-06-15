package aulas.udemy.java.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("mauro lucio");
		list.add("everton cristian");
		list.add("ethelin helena");
		list.add("evelin maria");
		list.add("andreia cristina");
		list.add("teste remoção");
		list.add("Teste indexOf");
		list.add(1, "roberta esch");
				
		System.out.println("O tamanho da lista é: "+ list.size());
		//list.remove("teste remoção");
		//list.remove(6);
		for(String x : list) {
			System.out.println(x);
		}
		//remove elemento com inicial 't'
		list.removeIf(x -> x.charAt(0) == 't');
		System.out.println("----------------------");
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		System.out.println("Index of mauro " + list.indexOf("Teste indexOf"));
		System.out.println("Index of mauro " + list.indexOf("teste remoção"));
		System.out.println("----------------------");
		//stream com filter e predicado
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'e').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		//stream com filter, findfirst e orelse
	    String name = list.stream().filter(x -> x.charAt(0) == 'e').findFirst().orElse(null);
		System.out.println(name);

	}
}
