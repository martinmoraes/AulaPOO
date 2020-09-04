import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Colecoes {
	
	public void executa() throws IOException {
		
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<Colecoes.Pessoa>();
		
		listaPessoas.add(new Pessoa("a","a"));
		listaPessoas.add(new Pessoa("b","b"));
		listaPessoas.add(new Pessoa("c","c"));
		listaPessoas.add(new Pessoa("d","d"));
		listaPessoas.add(new Pessoa("e","e"));
		
		for(Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}
		
		System.out.println();
		System.out.println(listaPessoas.get(2));
		
		System.out.println();
		listaPessoas.remove(3);
		listaPessoas.forEach(action -> {
			System.out.println(action);
		});
		
		System.out.println();
		System.out.println(listaPessoas.size());
		
		System.out.println();
		
		Path path = Paths.get("C:\\Users\\Usuário\\OneDrive\\Documentos\\ESTUDO\\Java\\APRESENTAÇÕES");
		boolean pathExists = Files.exists(path);
		System.out.println(pathExists);
			
		System.out.println(	);
		Path start = Paths.get("C:\\Users\\Usuário\\eclipse-workspaceAAAAA");
		int maxDepth = 5;
		Stream<Path> stream = Files.find(
			start, 
			maxDepth, 
			(p, attr) -> String.valueOf(p).endsWith(".java"));
		
		stream.sorted().forEach(System.out::println); 

		
		

	}
	
	
	
	
	
	class Pessoa{
		public String nome;
		public String fone;
		
		public Pessoa(String nome, String fone) {
			this.nome = nome;
			this.fone = fone;
		}

		@Override
		public String toString() {
			return "Pessoa [nome=" + nome + ", fone=" + fone + "]";
		}
		
		
	}

}
