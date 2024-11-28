package persona.prueba_persona;

import persona.Persona;

public class RetoPersona {
    public static void main(String[] args) {
        //Creación de clase y objetos persona.Persona
        System.out.println("*** Creación de Clase y Objetos Persona***");
        System.out.println("Variable estática: " + Persona.getContadorPersonas());
        //Primer Objeto
        var objeto1 = new Persona("Lola","Acosta");
        System.out.println(objeto1); //Automáticamente se llama el método toString
        System.out.println("Variable estática: " + Persona.getContadorPersonas());
        //Segundo Objeto
        var objeto2 = new  Persona("Juan","Lopez");
        System.out.println(objeto2);
        System.out.println("Variable estática: "+ Persona.getContadorPersonas());
       // System.out.println("Variable estática: " + Persona.contadorPersonas);

    }
}
