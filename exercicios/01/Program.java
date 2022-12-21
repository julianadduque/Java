import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a, b, c, d, resultado ;
	a = sc.nextDouble();
	b = sc.nextDouble();
	c = sc.nextDouble();
	d = sc.nextDouble();
	resultado = (a * b - c * d);
	System.out.printf("resultado=%.4f " , resultado);
	sc.close();
	}
}
