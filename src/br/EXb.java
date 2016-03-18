package br;

public class EXb implements Desenho {

	@Override
	public void desenhar(int SIZE) {
       for (int l = 0; l < SIZE; l++){
    	   for (int c = SIZE; c > l; c--){
    		   System.out.print("#");
    	   }
    	   System.out.println("");
       }
	}
}
