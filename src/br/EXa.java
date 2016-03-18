package br;

public class EXa implements Desenho {

	@Override
	public void desenhar(int SIZE) {
       for (int l = 0; l < SIZE; l++){
    	   for (int c = 0; c <= l; c++){
    		   System.out.print("#");
    	   }
    	   System.out.println("");
       }
	}
}
