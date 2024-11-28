public class ReglasNombresVariables {
    public static void main(String[] args) {
        //Reglas nombres variables
        String nombreCompleto = "Carlos Sanchez"; //Correcto y buenas prácticas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Carlos Sanchez"; //Correcto y no aplica buenas prácticas
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente = "Carlos Sanchez"; //Incorrecto
        String nombre_Completo = "Carlos Sanchez"; //Correcto y no aplica buenas prácticas
        String _apellido = "Perez"; //Correcto y aceptable
        String $apellido = "Perez"; //Correcto y aceptable

        int totPzs = 10; // Correcto, no aplica buenas prácticas
        int totalPiezas = 10; // Correcto, aún puede mejorar

        boolean casado = true; // Correcto, no aplica buenas prácticas
        boolean esCasado = true; // Correcto, aplica buenas prácticas
        boolean isCasado = true; //Correcto, aplica buenas prácticas
        boolean tieneSaldo = false; // Correcto, aplica buenas prácticas
        boolean hasSaldo = false; // Correcto, aplica buenas prácticas

        System.out.println("NombreCompleto = " + NombreCompleto);
    }
}