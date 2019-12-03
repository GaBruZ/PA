package vetores;

import java.util.Arrays;
import java.util.Scanner;

  public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int valor[] = new int[10];
		int c=0;
		Arrays.sort(valor);
		for(int i = 0; i < valor.length; i++){
			System.out.print("Digite o " +(i+1)+"º valor: ");
			valor[i] = ler.nextInt();
	}
		Arrays.sort(valor);
		System.out.println("ordem crescente: ");
		for (int b: valor){
			System.out.print(+b+" ");
			
		}
		Arrays.sort(valor);
		System.out.print("ordem decrescente: ");
		for (int b: valor){
			
		}
		 for(int i =0;i<valor.length;i++){
		        valor[i] = valor.length - i;
		        System.out.print(+valor[i]+" ");

		    }
	

		}
			
		}
     				
		  
	
	


