import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double a;
		char b;
		
		//Leitura de caractere
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		//Leitura de valor inteiro
		y = sc.nextInt();
		System.out.println("Voce digitou o valor inteiro: " + y);
		
		//Leitura de valor com ponto flutuante
		a = sc.nextDouble();
		System.out.println("Voce digitou o valor com ponto fluante: " + a);
		
		//Leitura de caractere tipo char
		b = sc.next().charAt(0);
		System.out.println("Voce digitou: " + b);
	
		sc.close();

	}

}
