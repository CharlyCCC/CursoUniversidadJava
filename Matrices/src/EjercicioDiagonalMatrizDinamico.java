import java.util.Scanner;

public class EjercicioDiagonalMatrizDinamico {
    public static void main(String[] args) {
        //Suma matriz diagonal dinámico
        Scanner consola = new Scanner(System.in);

        int renglones, columnas;
        int sumaDiagonal = 0;

        System.out.println("Definiendo los parámetros de la matriz");
        System.out.print("Ingrese la cantidad de renglones: ");
        renglones = consola.nextInt();
        System.out.print("Ingrese la cantidad de renglones: ");
        columnas = consola.nextInt();

        int [][] matriz = new int[renglones][columnas];
        System.out.println(" ");
        //Solicitar valores
        for (int ren=0;ren<renglones;ren++){
            for (int col=0;col<columnas;col++){
                System.out.print("Ingrese el valor para el campo["+ren+"]["+col+"]: ");
                matriz[ren][col] = consola.nextInt();
            }
        }
        System.out.println(" ");
        for (int ren=0;ren<renglones;ren++){
            for (int col=0;col<columnas;col++){
                if (ren == col){
                    sumaDiagonal += matriz[ren][col];
                    System.out.println("Valor de la casilla ["+ren+"]["+col+"] = "+ matriz[ren][col]);
                }
            }
        }

        System.out.println("\nLa suma de los valores en diagonal es: "+sumaDiagonal);
    }
}
