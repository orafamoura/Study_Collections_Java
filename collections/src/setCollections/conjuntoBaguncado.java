package setCollections;

import java.util.HashSet;
//nao recomendado
public class conjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> double
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("tamanho e " + conjunto.size()); // tamanho 5
		
		conjunto.add("teste"); // nao aceita repeticao, se fosse T maiusculo, tamanho 6
		conjunto.add('x');
		
		System.out.println("tamanho e " + conjunto.size()); // tamanho 5
		
		System.out.println(conjunto.remove("teste")); // true
		System.out.println(conjunto.remove("Teste")); // false
		
		//contains serve para mostrar se o elemento esta dentro do conjunto
		System.out.println(conjunto.contains("teste")); // true
		System.out.println(conjunto.contains(false)); // false
		
		HashSet nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		//conjunto.addAll(nums); // uniao entre dois conjuntos
		conjunto.retainAll(nums); // resultado 1, ele guarda o que tem em comparacao
		System.out.println(conjunto);
		
		conjunto.clear();
	}
}
