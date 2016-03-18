package br;

public class EXm implements Desenho {

	@Override
	public void desenhar(int SIZE) {
		for (int l = 1; l <= SIZE; l++){
			for (int c = 1; c <= SIZE; c++){
				if (c <= l)
					System.out.print(c + " ");
				else 
					System.out.print("  ");
			}
			System.out.println("");
		}

	}

}
