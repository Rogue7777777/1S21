import java.util.Scanner;

public class p3p7_1s22{
    public static int [][] captura(){
        int matriz = new int [3][3];
        Scanner teclado= new Scanner(system.in);
        for (int f=0;f<3;f++){
            for (int c=0;c<3;c++){
                System.out.println("ingreses el valo para la posicion["+f+"]["+c+"]: ");
                matriz[f][c]=teclado.nextInt();
            }
            return matriz;
        }
        public static void main(String[] args) {
            int ma[][] = captura();
            int mb[][] = captura();
            int mc[][] = captura();

        }

    }
}