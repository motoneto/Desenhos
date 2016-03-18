package br;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Desenhar um quadrado?
 * 
 * @author EHDFREITAS
 *
 */

public class Principal {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Desenho d = new Quadrado();
		
		//Desenho d = new QuadradoProfessor();

		//Desenho d = new EXa();

		//Desenho d = new EXb();

		//Desenho d = new EXc();

		//Desenho d = new EXd();
			
		//Desenho d = new EXe();
		
		//Desenho d = new EXf();
		
		//Desenho d = new EXg();
		
		//Desenho d = new EXh();
		
		//Desenho d = new EXi();
	
		//Desenho d = new EXj();

		//Desenho d = new EXk();
		
		//Desenho d = new EXl();
		
		//Desenho d = new EXm();
		
		//Desenho d = new EXn();
		
		//Desenho d = new EXo();

		//Desenho d = new EXp();

		//Desenho d = new EXq();
		
		//Desenho d = new EXr();
		
		//Desenho d = new EXs();
		
		//Desenho d = new EXt();

		//Desenho d = new EXu();
		
		//d.desenhar(leia.nextInt());
		
		List<Desenho> ListaDesenhos = new ArrayList<Desenho>();
		
		ListaDesenhos.add(new EXa());
		ListaDesenhos.add(new EXb());
		ListaDesenhos.add(new EXc());
		ListaDesenhos.add(new EXd());
		ListaDesenhos.add(new EXe());
		ListaDesenhos.add(new EXf());
		ListaDesenhos.add(new EXg());
		ListaDesenhos.add(new EXh());
		ListaDesenhos.add(new EXi());
		ListaDesenhos.add(new EXj());
		ListaDesenhos.add(new EXk());
		ListaDesenhos.add(new EXl());
		ListaDesenhos.add(new EXm());
		ListaDesenhos.add(new EXn());
		ListaDesenhos.add(new EXo());
		ListaDesenhos.add(new EXp());
		ListaDesenhos.add(new EXq());
		ListaDesenhos.add(new EXr());
		ListaDesenhos.add(new EXs());
		ListaDesenhos.add(new EXt());
		ListaDesenhos.add(new EXu());
		
		System.out.println("Tamanho?");
		int tamanho = leia.nextInt();
		for (Desenho d : ListaDesenhos){
			d.desenhar(tamanho);
		}
		
		leia.close();
	}
}
