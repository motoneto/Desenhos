package br;

public class EXj implements Desenho {

	@Override
	public void desenhar(int SIZE) {
	       
		for (int l = SIZE; l > 0; l--){
    	   for (int c = 0; c <= SIZE * 2; c++){
  			   if (c > (SIZE - l + 1) && (c <= (SIZE + l)))
  				   System.out.print("# ");
  			   else {
  				   System.out.print("  ");
  				   //if (c )
  			   }
    	   }
    	   System.out.println("");
       }
	}
}
