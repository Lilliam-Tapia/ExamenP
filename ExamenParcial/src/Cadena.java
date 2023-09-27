import java.util.Scanner;

public class Cadena{
    public static void main( String [] args){
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese una cadena de palabra: ");
        String palabra = lector.nextLine();

        String cadena = new String(palabra).toUpperCase(); 
        System.out.println("La cadena es: "+cadena);

    }
}