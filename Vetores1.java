package PacoteJava;

import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int n[] = {2,5,1,3,4,9,7,8,10,6};
		
		int x,posiçao = 0,l=-1;
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" Digite o numero que voce deseja encontrar: ");
		x = leia.nextInt();
				

				for(posiçao=0;posiçao<10; posiçao++) {
					
					if (n[posiçao] == x) {
						l = posiçao;
			
						System.out.println("O numero esta na posição: "+l);
		}
 
					
	}
				if (l <0)
				System.out.println("O numero nao foi encontrado: ");
				
	}
}

