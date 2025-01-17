package setCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoCorreto {

	public static void main(String[] args) {

		// passando String(generics), voce fala que a lista vai ser somente de Strings
		Set<String> listaAprovados = new HashSet<>();
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
				
		for(String candidato: listaAprovados) {
			System.out.println(candidato); // ele printa sem ordenacao
		}
		// treeset faz parte do sortedset
		SortedSet<String> listaAprovados2 = new TreeSet<>(); // garante ordem de insercao
		
		listaAprovados2.add("Ana");
		listaAprovados2.add("Carlos");
		listaAprovados2.add("Luca");
		listaAprovados2.add("Pedro");
				
		for(String candidato: listaAprovados2) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(100);
		nums.add(2);
		nums.add(120);
		nums.add(4);
				
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
