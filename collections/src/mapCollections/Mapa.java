package mapCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		//supondo como se fosse id e o nome do usuario
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//put adiciona e altera
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3,  "Maria");
		usuarios.put(4,  "Raphael");
		
		System.out.println(usuarios.size()); //tamanho
		System.out.println(usuarios.isEmpty()); // se esta vazia
		
		System.out.println(usuarios.keySet()); // busca as chaves
		System.out.println(usuarios.values()); // busca os valores
		System.out.println(usuarios.entrySet()); // chave e valor
		
		System.out.println(usuarios.containsKey(20)); //contem a chave 20
		System.out.println(usuarios.containsValue("Ricardo")); // contem o valor Ricardo
		
		System.out.println(usuarios.get(4)); // busca o valor da chave 4
		
		// busca somente as chaves
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		// busca somente os valores
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//foreach de chave e valor usando o Entry
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
			
	}
}
