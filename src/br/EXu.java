package br;

//public class EXu implements Desenho {
public class EXu extends ClasseAbstrata {

	@Override
	protected String GetNome(){
		return "u";
	}
	
	
	@Override
	public void desenhar(int SIZE) {
		
		identificar();
		
		for(int l = 1; l <= SIZE; l++){
			int x = l;
			for (int c = SIZE * 2; c > 0; c--){
				if (c > SIZE - l && c < SIZE + l) {				
					if (x > 9)
						x = 0;
					if (x < 0)
						x = 9;
					if (c <= SIZE)
						System.out.print(x-- + " ");
			        else
						System.out.print(x++ + " ");
				}
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}

	}

}
