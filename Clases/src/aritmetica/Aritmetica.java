package aritmetica;

public class Aritmetica {
    private int operando1, operando2;

    //Constructor vacío
    public Aritmetica(){
        //Si el constructor está vacío, al instanciar el nuevo objeto no necesita setear los valores de las variables en ese momento, sino que se pueden pedir después.
    }


    public Aritmetica(int operando1, int operando2){
        //System.out.println("Ejecutando Constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
        //System.out.println("Operador this = " + this);
    }

    public void sumar(){
        var resultado = operando1+operando2;
        System.out.println("resultado Suma: " + resultado);
    }

    public void restar(){
        var resultado = operando1-operando2;
        System.out.println("resultado Resta: " + resultado);
    }


    public int getOperando1(){
        return this.operando1;
    }

    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }

    public int getOperando2(){
        return this.operando2;
    }

    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }


}
