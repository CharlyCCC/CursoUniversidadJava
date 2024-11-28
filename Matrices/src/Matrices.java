public class Matrices {
    public static void main(String[] args) {
        System.out.println("*** Matrices ***");
        //Son arreglos en 2 dimensiones, por lo que cuenta con dos índices (se podría dedcir que es un arreglo que apunta a dos arreglos)

        //Definimos la matríz (2renglones x 3 columnas)
        int matriz[][] = new int[2][3];
        var matriz2 = new int[2][3];

        //Modificar los valores de la matríz. Primero al renglón y después a la columa
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        //Accedemos a los valores
        //System.out.println("Valor 1 [0][0]: " + matriz[0][0]);

        //Acceder con ciclo for
        for (int ren =0; ren<2;ren++){
            for (int col=0;col<3;col++){
                System.out.println("Campo ["+ren+"]["+col+"]: "+matriz[ren][col]);
            }
        }


    }
}
