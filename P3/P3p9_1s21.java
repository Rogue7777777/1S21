
public class P3p9_1s21{
	public static void f(int a, int b){
		int c = a + b;
		if (c<x){
			System.out.println(" " + c);
			f(b,c);
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new scanner(System.in);
		System.out.println("ingrese las veces que desea repetir: ");
		x = teclado.nextInt();
		System.out.println("0 1");
		f(0,1);
		System.out.println();
	}
}