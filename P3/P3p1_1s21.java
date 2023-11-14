import java.util.Scanner;
public class P3p1_1s21{
	static 	Scanner teclado = new Scanner(System.in);
	public static void Suma() {
		System.out.println("haremos una suma:");
		System.out.println("Inserte el primer numero: ");
		int a=teclado.nextInt();
		System.out.println("Inserte el segundo nombre");
		int b=teclado.nextInt();
		int c=a+b;
		System.out.println("El resultado de la suma es: " + c);
	}	
    public static void Resta() {
		System.out.println("haremos una resta:");
		System.out.println("Inserte el primero numero: ");
		int a=teclado.nextInt();
		System.out.println("Inserte el segundo numero:");
		int b=teclado.nextInt();
		int c=a-b;
		System.out.println("El resultado de la resta fue: " + c);
    }
    public static void Division() {
		System.out.println("haremos una division:");
		System.out.println("Inserte el primer numero:");
		int a=teclado.nextInt();
		System.out.println("Inserte el segundo numero:");
		int b=teclado.nextInt();
		int c=a/b;
		System.out.println("La division fue " + c);
    }
    public static void Multiplicacion() {
		System.out.println("haremos una multiplicacion:");
		System.out.println("Inserte el primer numero:");
		int a=teclado.nextInt();
		System.out.println("Inserte el segundo numero:");
		int b=teclado.nextInt();
		int c=a*b;
		System.out.println("La multiplicacion fue " + c);
    }
	public static void Salir() {
		System.out.println("salio de las operaciones logicas");
	}
    public static void Menu() {
    	System.out.println("operacion logicos");
	    System.out.println("A) Suma");
	    System.out.println("B) Resta");
	    System.out.println("C) Division");
	    System.out.println("D) Multiplicacion");
	    System.out.println("S) Salir");
    }
    public static void main(String[] args){
    	Menu();
    	String opc=teclado.nextLine();
    	if (opc.equals("A"))Suma();
    	if (opc.equals("B"))Resta();
    	if (opc.equals("C"))Division();
    	if (opc.equals("D"))Multiplicacion();
    	if (opc.equals("S"))Salir();
    }
}




