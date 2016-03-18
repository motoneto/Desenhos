package br;

public class EXp implements Desenho {

	@Override
	public void desenhar(int SIZE) {
		for (int l = 1; l <= SIZE; l++){
			for (int c = SIZE; c >= 0; c--){
				if (c >= l)
					System.out.print(c + 1 - l + " ");
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}

	}

}
