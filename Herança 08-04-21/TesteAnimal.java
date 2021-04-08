package POO;

import java.util.Scanner;

public class TesteAnimal {
	
	public static void main (String[] args) {
		
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("**********************CACHORRO*****************************\n");
		System.out.println("Nome do animal: ");
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
	
		Cachorro cachorro = new Cachorro ( nome, tempodevida,classeAnimal, habitat, alimentacao,raca);
		System.out.println("Latir: ");cachorro.emitirSom();
		
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
		System.out.println("Relinchar:"+cavalo.getrelinchar());
		
		System.out.println("************************PREGUIÇA**********************\n");
		
		preguica.setNome("Slow");
		preguica.setClasseAnimal("Mamifero");
		preguica.setHabitat("Floresta, arvores");
		preguica.setTempodevida("30 a 40 anos");
		preguica.setTamanho("60 cm");
		preguica.setAlimentacao("Folhas de arvores");
		
		System.out.println("Nome do animal: "+preguica.getNome());
		System.out.println("Tamanho da Preguiça: "+preguica.getTamanho());
		System.out.println("Tempo de vida: : "+preguica.getTempodevida());
		System.out.println("Classe do animal: "+preguica.getClasseAnimal());
		System.out.println("Alimentação: "+preguica.getAlimentacao());
		System.out.println("Habitat: "+preguica.getHabitat());
		System.out.println("Som emitido pela preguiça:"+preguica.getSomp());
	}

}
