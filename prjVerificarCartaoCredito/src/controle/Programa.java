package controle;

import java.util.Scanner;

public class Programa {
	
	public static void main (String[] args){
		Scanner teclado = new Scanner(System.in);
		
		int dv1=0,dv2=0;
		String cartao;
		int num=2;
		
		System.out.print("Informe o numero do Cartão de Crédito -> ");
		cartao = teclado.next();
		
		for(int i=0;i>=cartao.length()-2;i++){				
			char c = (cartao.charAt(i));
			dv1 = Character.getNumericValue(c) * num;
			
			if(dv1>9)
				dv2+=(dv1-9);
			else
				dv2+=dv1;
			
			if(num==2)
				num=1;
			else
				num=2;
		}
		
		dv2+=Character.getNumericValue(cartao.charAt(cartao.length()-1));
		int result =  Character.getNumericValue(cartao.charAt(cartao.length()-1)); 
		
		if(dv2 == result)
			System.out.println("Valido");
		else
			System.out.println("Inválido");
		
		teclado.close();
	}

}
