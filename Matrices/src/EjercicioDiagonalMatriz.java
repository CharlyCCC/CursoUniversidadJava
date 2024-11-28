import java.util.Scanner;

public class EjercicioDiagonalMatriz {
    public static void main(String[] args) {
        //Suma en diagonal matriz donde renglon y columna es igual
        Scanner consola = new Scanner(System.in);
        final int RENGLONES =3;
        final int COLUMNAS = 3;
        int renglones, columnas = 0;

        int [][]matriz = new int[][]{
                {100,200,300},
                {400,500,600},
                {700,800,900}
        };

        int sumaDiagonal=0;
        for (int ren=0;ren<RENGLONES;ren++){
            for (int col=0;col<COLUMNAS;col++){
                if (ren==col){
                    sumaDiagonal += matriz[ren][col];
                    System.out.println("Valor de la casilla: "+matriz[ren][col]);
                }
            }
        }

        System.out.println("El total de la suma es de: "+sumaDiagonal);



    }
}
