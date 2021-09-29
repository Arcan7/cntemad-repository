public class Thread2 extends Thread {
	public void run() {
		super.run();
		
		//var
		int init = 0; //valeur initiale
		int inc = -1; //increment negatif
		int Nit = 8; //nombre d'iteration
		int x = 2000; //le temps entre 2 interations 
		
		for(int i=0 ; i<Nit; i++){
			//on incremente la valeur initiale puis on l'affiche
			init += inc; //init++
			
			System.out.println(init);
		}
		
		//gestion d'erreur
		try {
			sleep(x); //on interrompt le Thread durant 2000ms
		}
		catch(InterruptedException e){
			System.out.print(e.getMessage()); //en cas d'erreur
		}
		
	}
}
