package dsa;

/**
 * Created by Ignacio on 01/03/2017.
 */
public class Controlador {
    public static int suma(int x, int y){
        return x+y;
    }
    public static int resta(int x, int y){
        return x-y;
    }
    public static int multipicacion(int x, int y){
        return x*y;
    }
    public static int division(int x, int y)throws Division_Nulo {
        if(y==0)
            throw new Division_Nulo();
        else return (x/y);
    }
}
