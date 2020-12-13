/**
 *
 * @author David
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        
        Scanner ler = new Scanner(System.in);
		int n = 0,d1,d2;
		do{
		System.out.println("Digite 9 digitos: ");
		n = ler.nextInt();
		}while(n < 99999999);
                
                CPF digito = new CPF(n);
                digito.gerador();
    }
    
}
