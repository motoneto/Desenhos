package br;

public class EXr implements Desenho {

	@Override
	public void desenhar(int SIZE) {
		for (int l = 1; l <= SIZE; l++){
			int x = 0;
			for (int c = 1; c <= SIZE * 2; c++){
				if ((c >= l) && (c <= SIZE * 2 - l)){
					if (c <= SIZE)
						System.out.print(++x + " ");
					else
						System.out.print(--x + " ");
				}
				else 
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}
}
