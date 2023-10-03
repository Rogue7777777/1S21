import java.util.Scanner;

class P4_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		System.out.printl("Ingresa tu nombre");
		nombre = teclado.nextLine();
		String edad;
		System.out.printl("Ingresa tu edad"); 
		edad = teclado.nextLine();
		String correo;
		System.out.printl("Ingresa tu correo");
		correo = teclado.nextLine();
		String telefono; 
		System.out.printl("Ingresa tu telefono");
		telefono = teclado.nextLine();
		System.out.println("Bienvenido tus datos son" + nombre + "años " + correo+ ", " + telefono + ".");
	}
}