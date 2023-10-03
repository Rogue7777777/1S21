import java.util.Scanner;
public class p13_1s21{
	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		byte n;
		byte i;
		byte a;
		int suma=0, factor;

		System.out.println("Ingresa el valor de N");
		n=teclado.nextByte();
		for(i=0;i<=n;i++){
			factor=1;
			if(i==0) factor=1;
			else{
				for(a=i;a>0;a--){
					factor*=a;
				}
			}
			suma += Math.pow(i,3)/factor;
		}
		System.out.println("La sumatoria es "+suma);
	}
}
