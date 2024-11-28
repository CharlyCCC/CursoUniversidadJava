import java.util.Scanner;

public class IntroducirDatosMatriz {
    public static void main(String[] args) {
        //Introducir valores a una matriz
        Scanner consola = new Scanner(System.in);
        int renglones, columnas;

        //Definir matriz
        System.out.println("Proporciona los valores de la matriz");
        System.out.print("Proporciona el numero de renglones: ");
        renglones = consola.nextInt();
        System.out.print("Proporciona el numero de columnas: ");
        columnas = consola.nextInt();

        var matriz = new int[renglones][columnas];

        //Solicitar los valores de manera dinámica
        for (int ren=0;ren<renglones;ren++){
            for (int col=0;col<columnas;col++){
                System.out.print("Ingrese el valor para el espacio ["+ren+"]["+col+"]: ");
                matriz[ren][col] = consola.nextInt();
            }
        }

        //Iterar los valores (Imprimir)
        for (int ren=0;ren<renglones;ren++){
            for (int col=0;col<columnas;col++){
                System.out.println("Matriz["+ren+"]["+col+"] = "+matriz[ren][col]);
            }
        }



    }
}
