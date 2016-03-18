package br;

public class EXl implements Desenho {

	@Override
	public void desenhar(int SIZE) {
       
		for (int l = SIZE * 2; l > 0; l--){
    	   for (int c = 0; c <= SIZE * 2; c++){
    		   if (l > SIZE){
    			   if (c >= (l - SIZE)){
    				   if (c >= ((SIZE * 2) - l) + SIZE - 1)
    					   System.out.print("  ");
    				   else
    					   System.out.print("# ");
    			   }
    			   else {
    				   System.out.print("  ");
    			   }
    		   } else {    			   
    			   if (c >= (SIZE - l) && (c < (SIZE + l - 1)))
    				   System.out.print("# ");
    			   else {
    				   System.out.print("  ");
    				   //if (c )
    			   }
    		   }
    	   }
    	   System.out.println("");
       }
	}
}
