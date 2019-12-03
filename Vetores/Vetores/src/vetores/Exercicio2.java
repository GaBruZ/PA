package vetores;
import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int a[], i2 = 0;
		
		a = new int[10];
		for(int i = 0; i < 10; i++) {
			System.out.println("informe o "+(i+1)+" numero ");
			a[i] = ler.nextInt();
			
		}
		while(i2 < 10) {
			if(a[i2] == 1) {
				System.out.println(a[i2]+ " é primo");
		}else if(a[i2] == 2) { 	
			System.out.println(a[i2]+ " é primo");
		}else if(a[i2] == 3) { 
			System.out.println(a[i2]+ " é primo");
		}else if(a[i2] == 5) { 
			System.out.println(a[i2]+ " é primo");
		}else if(a[i2] == 7) { 
			System.out.println(a[i2]+ " é primo");
		}else if(a[i2] == 11) { 
			System.out.println(a[i2]+ " é primo");
		}else if(a[i2] % 2 != 0 || a[i2] % 3 != 0 || 
		a[i2] % 5 != 0 || a[i2] % 7 != 0 || a[i2] % 11 != 0) {
			System.out.println(a[i2]+" Não é primo");
		}else {
			System.out.println(a[i2]+" é primo");
		}
		i2++;
	}

}
}
