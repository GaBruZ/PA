package vetores;
	import java.util.Scanner;
		public class Exercicio1 {
		public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			double a[], b[];
			int i;
			
			a = new double [10];
			b = new double [10];
			 for (i=0; i<10; i++) {
				 System.out.println("Entre com o "+(i + 1)+"º valor");
				 a[i] = ler.nextInt();
				 b[i] = Math.sqrt(a[i]);
				 
			 	}
			 
			 for (i=0; i<10; i++) {
				 System.out.println(" A raiz de "+ (a[i]) +" é " + b[i]);
			 }
			}
		}