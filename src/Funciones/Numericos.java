
package Funciones;

public class Numericos {
    
    public static void main(String arg[]){
        int resultado = getDoble(4);
        int esperado = 8;
        
        if (resultado == esperado) 
            System.out.println("si");
        else
            System.out.println("no");
        
        int resultado1 = getCuadreado(5);
        int esperado1 = 25;
        
        if (resultado1 == esperado1) 
            System.out.println("si");
        else
            System.out.println("no");
        
    }
    
    public static int getDoble(int numero){
        return (numero * 2);
    }
    
     public static int getCuadreado(int numero){
        return (numero * numero);
    }
     
    public static int getSuma(int numero,int numero2){
        return (numero + numero2);
    }
    
    public static int getResta(int numero,int numero2){
        return (numero - numero2);
    }
    
    public static int getMultiplicacion(int numero,int numero2){
        return (numero * numero2);
    }
    
    public static int getDivicion(int numero,int numero2){
        return (numero / numero2);
    }
}
