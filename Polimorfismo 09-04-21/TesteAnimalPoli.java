package POO;

import java.util.Scanner;

public class TesteAnimalPoli {
	
public static void main (String[] args) {
		
		CavaloPolimorfismo cavalo = new CavaloPolimorfismo();
		PreguicaPolimorfismo preguica = new PreguicaPolimorfismo();
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("**********************CACHORRO*****************************\n");
		System.out.println("Nome do cachorro: ");
		String nome = scanner.nextLine();
		System.out.println("Raça do cachorro: ");
		String raca = scanner.nextLine();
		System.out.println("Tempo de vida: : ");
		String tempodevida = scanner.nextLine();
		System.out.println("Classe do animal: ");
		String classeAnimal = scanner.nextLine();
		System.out.println("Alimentação: ");
		String alimentacao = scanner.nextLine();
		System.out.println("Habitat: ");
		String habitat = scanner.nextLine();
	
		CachorroPolimorfismo cachorro = new CachorroPolimorfismo ( nome, tempodevida,classeAnimal, habitat, alimentacao,raca);
		
		scanner.nextLine();
		
	    System.out.println("**************************CAVALO**************************\n");
		cavalo.setNome("Horse");
		cavalo.setClasseAnimal("Mamifero");
		cavalo.setCor("Marrom");
		cavalo.setHabitat("Fazenda, campo");
		cavalo.setTempodevida("25 a 30 anos");
		cavalo.setVelocidade("40km/h");
		cavalo.setAlimentacao("Grama");
		
		System.out.println("Nome do animal: "+cavalo.getNome());
		System.out.println("Velocidade do cavalo: "+cavalo.getVelocidade());
		System.out.println("Tempo de vida: : "+cavalo.getTempodevida());
		System.out.println("Classe do animal: "+cavalo.getClasseAnimal());
		System.out.println("Alimentação: "+cavalo.getAlimentacao());
		System.out.println("Habitat: "+cavalo.getHabitat());
		
		System.out.println("************************PREGUIÇA**********************\n");
		
		
		System.out.println("Nome do animal: "+preguica.getNome());
		System.out.println("Tempo de vida: : "+preguica.getTempodevida());
		System.out.println("Classe do animal: "+preguica.getClasseAnimal());
		System.out.println("Alimentação: "+preguica.getAlimentacao());
		System.out.println("Habitat: "+preguica.getHabitat());
		
		AnimalPolimorfismo animal = null;
		
		System.out.println("\nMenu: \n1-Emitir som e ação do cachorro.\n2-Emitir som e ação do cavalor.\n3-Emitir som e ação da preguiça.");
		int n = scanner.nextInt();
		switch(n)
		{
		case 1: cachorro.som(1); cachorro.acao(1); break;
		case 2: cavalo.som(1); cavalo.acao(1); break;
		case 3: preguica.som(1); preguica.acao(1); break;
		default : System.out.println("ERRO!"); 
		}
	}


}
