import java.util.Scanner;
import java.util.Scanner;
public class p11_1s21{
public static void main(String[] args) {
Scanner teclado= new Scanner(System.in);
Scanner valor= new Scanner(System.in);
System.out.println("Ingresa una opcion (suma, resta, division, multiplicacion, raiz cuadrada, potencia): ");
String opc="a";
opc=teclado.nextLine();
switch(opc){
case "suma":
System.out.println("aqui el caso suma");
System.out.println("Ingresa un numero: ");
int numero1=valor.nextInt();
System.out.println("Ingresa otro numero: ");
int numero2=valor.nextInt();
int suma= numero1+numero2;
System.out.println("Tu resultado es: " +suma);
break;
case "resta":
System.out.println("aqui el caso resta");
System.out.println("Ingresa un numero: ");
int numero3=valor.nextInt();
System.out.println("Ingresa otro numero: ");
int numero4=valor.nextInt();
int resta= numero3-numero4;
System.out.println("Tu resultado es: " +resta);
break;
case "multiplicacion":
System.out.println("aqui el caso suma");
System.out.println("Ingresa un numero: ");
int numero5=valor.nextInt();
System.out.println("Ingresa otro numero: ");
int numero6=valor.nextInt();
int multiplicacion= numero5*numero6;
System.out.println("Tu resultado es: " +multiplicacion);
break;
case "division":
System.out.println("aqui el caso suma");
System.out.println("Ingresa un numero: ");
int numero7=valor.nextInt();
System.out.println("Ingresa otro numero: ");
int numero8=valor.nextInt();
int division= numero7/numero8;
System.out.println("Tu resultado es: " +division);
break;
case "raiz cuadrada":
System.out.println("aqui el caso raiz cuadrada");
System.out.println("Ingresa un numero");
int numero9 = valor.nextInt();
        double resultado = Math.sqrt(numero9);
        System.out.println("La raíz cuadrada de " + numero9 + " es " + resultado);
        break;
    case "potencia":
    System.out.println("aqui el caso potencia");
    System.out.println("Indica un numero");
int numero10 = valor.nextInt();
System.out.println("Indica la potencia");
int numero11 = valor.nextInt();
double cuadrado = Math.pow(numero10, numero11);
System.out.println(numero10 + "elevado a la" +numero11+ "es" + cuadrado);
default:
System.out.println("No se encuentra la opcion deseada");
}
}
}