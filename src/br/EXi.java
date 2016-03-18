package br;

public class EXi implements Desenho {

	@Override
	public void desenhar(int SIZE) {
		for (int i = 0; i < SIZE; i++){
			for (int h = 0; h < SIZE; h++){
				if (i == 0 || i == SIZE - 1)
					System.out.print("# ");
				else {
					if ((h == 0 || h == SIZE - 1) || (h == i || h == (SIZE - (i + 1))))
						System.out.print("# ");
					else 
						System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
}
