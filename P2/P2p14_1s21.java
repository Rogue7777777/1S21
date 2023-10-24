import java.util.Scanner;

public class P2p14_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] Ma,Mb,Mc;
		int fa,ca,fb,cb,f,c,r,h;
		System.out.printl("Ingresa el numero de filas para la matriza A");
		fa = teclado.nextInt();
		System.out.printl("Ingresa el numero de columnas para la matriz A");
		ca=teclado.nextInt();
		System.out.printl("Igresa el numero de filas para la matriz B");
		fb = teclado.nextInt();
		System.out.printl("Ingresa el numero de columnas para la matriz B");
		cb = teclado.nextInt();
		if (ca == fb){
			Ma = int[fa][ca];
			Mb = int[fb][cb];
			Mc = int[fa][cb];
			for (i=0;f<fa;f++){
				for (c=0;c<ca;c++){
					System.out.printl("Ingresa el valor para Ma["+f+"]["+c+"]: ");
					Ma[f][c]=teclado.nextInt();
				}
			}
			for (i=0;f<fb;f++){
				for (c=0;c<cb;c++){
					System.out.printl("Ingresa el valor para Ma["+f+"]["+c+"]: ");
					Mb[f][c]=teclado.nextInt();
				}
			}
			//aqui empezamos a la multiplicacion
			for (f=0;f<fa;f++){
				for (c=0;c<cb;c++){
					for(h=0;h<fb;h++){
						r=Ma[f][h]*Mb[c][h];
					}
					Mc[f][c]=r;
				}
			}
		}else{
			System.out.printl("No se puede realizar el proceso de multiplicacion");
		}
	}
}