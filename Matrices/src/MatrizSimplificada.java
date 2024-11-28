public class MatrizSimplificada {
    public static void main(String[] args) {
        System.out.println("*** Matríz Simplificada ***");

        //Definimos la matríz
        int[][] matriz = new int[][]{
                {100,200,300},
                {400,500,600}
        };

        //Recorrer la matriz
        //1. Recorrer el ciclo externo -->> Recorrer los renglones.
        for (int renglon=0;renglon<matriz.length;renglon++){
            //Recorrer ciclo interno -->> Recorrer las columnas.
            for (int columna=0;columna< matriz[renglon].length; columna++){
                System.out.println("Casilla ["+renglon+"]["+columna+"] = "+matriz[renglon][columna]);

            }
        }


    }
}
