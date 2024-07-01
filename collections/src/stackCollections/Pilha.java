package stackCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno principe"); // retorna um boolean
		livros.push("Don Quixote"); //retorna exception
		livros.push("O hobbit");
		
		//o ultimo a entrar e o primeiro a sair, retorna O hobbit
		System.out.println(livros.peek());
		
		System.out.println(livros.poll()); //remove do ultimo pro primeiro
		System.out.println(livros.pop()); // retorna exception
		
		livros.size();
		livros.contains(livros);
		livros.clear();
	}
	
	
}
