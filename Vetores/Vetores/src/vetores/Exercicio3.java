package vetores;
import java.util.*;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int a[],b[], i = 9, teste = 0;
		
		a = new int[10];
		b = new int[10];
		
		for(int i2 = 0; i2 < 10; i2++) {
			System.out.println("informe o "+(i2+1)+" numero pls");
			a[i2] = ler.nextInt();
			
			b[teste] = a[i2];
		teste++;
		}
		i=9;
		while(i>=0) {
			 
			System.out.println(b[i]);
			i--;
		}
		
		

	}

}
