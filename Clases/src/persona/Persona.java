package persona;

public class Persona {
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre, apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        //Asignamos el ID único con ayuda de la variable estática
        this.idPersona = ++contadorPersonas;
    }

    @Override
    public String toString(){
        return "ID: "+ this.idPersona+
                ", Nombre:" + this.nombre
                + ", Apellido: " + this.apellido
                + ", Dirección de Memoria:  "
                + super.toString();
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }

}
